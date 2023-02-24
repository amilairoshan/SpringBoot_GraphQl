package com.graphql.dto;

import java.io.Serializable;

public class CreatePostDTO implements Serializable{

	private String postName;
	private String postContent;
	private int noOfLikes;
	private boolean postIsDisplay;
	
	public CreatePostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	

	public int getNoOfLikes() {
		return noOfLikes;
	}

	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}

	public boolean isPostIsDisplay() {
		return postIsDisplay;
	}

	public void setPostIsDisplay(boolean postIsDisplay) {
		this.postIsDisplay = postIsDisplay;
	}
	
	
	
	
	
}
