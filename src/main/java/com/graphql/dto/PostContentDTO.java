package com.graphql.dto;

import java.util.List;
import com.graphql.response.CommonResponse;

public class PostContentDTO extends CommonResponse{
	private List<PostDTO> postList;

	public PostContentDTO() {
		super();
	}

	public List<PostDTO> getPostList() {
		return postList;
	}

	public void setPostList(List<PostDTO> postList) {
		this.postList = postList;
	}

	@Override
	public String toString() {
		return "PostContentDTO [postList=" + postList + "]";
	}
	
	
}
