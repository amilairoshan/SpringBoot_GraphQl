package com.graphql.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostCommentsDTO implements  Serializable{
	
	private Long id;
	
	private String comentContent;
	
	public PostCommentsDTO() {
		super();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getComentContent() {
		return comentContent;
	}

	public void setComentContent(String comentContent) {
		this.comentContent = comentContent;
	}

	public PostCommentsDTO(Long id, String comentContent) {
		super();
		this.id = id;
		this.comentContent = comentContent;
	}
	
	
	
	
	
	
}
