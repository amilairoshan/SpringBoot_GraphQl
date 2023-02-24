package com.graphql.resolver;

import java.util.Collections;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.dto.CreatePostDTO;
import com.graphql.dto.PostDTO;
import com.graphql.model.Posts;
import com.graphql.service.PostsService;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class PostMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PostsService postsService;
	
	
	public Posts createPosts(CreatePostDTO createPostDTO ) {
		return postsService.createPost(createPostDTO);
	}
	
	public String deletePosts(Long postId) {
		postsService.deletePost(postId);
		return "Deleted post Id :"+postId;
	}

}
