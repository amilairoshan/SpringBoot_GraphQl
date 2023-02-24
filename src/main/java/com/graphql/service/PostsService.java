package com.graphql.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.graphql.dto.CreatePostDTO;
import com.graphql.dto.PostContentDTO;
import com.graphql.dto.PostDTO;
import com.graphql.exception.ResourceNotFoundException;
import com.graphql.model.Posts;
import com.graphql.repository.PostRepository;

@Service
public class PostsService {
	
	private PostRepository postRepository;
	private ModelMapper modelMapper;

	@Autowired
	public PostsService(PostRepository postRepository, ModelMapper modelMapper) {
		this.postRepository = postRepository;
		this.modelMapper = modelMapper;
	}
	
	
	
	public PostContentDTO getPosts(Long PostId) {
		PostContentDTO postContentDto=new PostContentDTO();
		Optional<Posts> post=postRepository.findById(PostId);
		if(!post.isPresent()) {
			throw new ResourceNotFoundException("Unable to find post with given post id :"+ PostId);
		}
		
		PostDTO postDto = this.modelMapper.map(post.get(), PostDTO.class);
		List<PostDTO> objects = Collections.singletonList(postDto);
		
		postContentDto.setStatusCode(HttpStatus.FOUND.value());
		postContentDto.setTotalRecord(1);
		postContentDto.setPostList(objects);
		
		return postContentDto;
	}

	public PostContentDTO allPosts() {
		PostContentDTO postContentDto=new PostContentDTO();
		List<Posts> post=postRepository.findAll();
		
		List<PostDTO> objectList =new  ArrayList<>();
		post.stream().forEach(postObj-> objectList.add(this.modelMapper.map(postObj, PostDTO.class)) );
		
		postContentDto.setStatusCode(HttpStatus.FOUND.value());
		postContentDto.setTotalRecord(post.size());
		postContentDto.setPostList(objectList);
		
		return postContentDto;
	}
	
	public Posts createPost(CreatePostDTO createPostDTO) {
		Posts post = this.modelMapper.map(createPostDTO, Posts.class);
		postRepository.save(post);
		return post;
	}
	
	public void deletePost(Long postId) {
		Optional<Posts> post =postRepository.findById(postId);
		if(post.isPresent()) {
			postRepository.deleteById(postId);
		}
		else {
			throw new ResourceNotFoundException("Unable to find post with given post id :"+ postId);
		}
	}
	
	

}
