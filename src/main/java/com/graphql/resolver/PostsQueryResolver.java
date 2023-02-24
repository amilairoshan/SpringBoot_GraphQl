package com.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.dto.PostContentDTO;
import com.graphql.service.PostsService;

import graphql.kickstart.tools.GraphQLQueryResolver;
@Component
public class PostsQueryResolver implements GraphQLQueryResolver  {


 private final PostsService postsService;
 
 @Autowired public PostsQueryResolver(PostsService postsService) { super();
 this.postsService = postsService; }
 

 public PostContentDTO getPosts(Long PostId) { return
 postsService.getPosts(PostId); }
 
 public PostContentDTO allPosts() { return postsService.allPosts(); }

	
	
	
}
