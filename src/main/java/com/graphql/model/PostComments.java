package com.graphql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostComments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String comentContent;

	public PostComments() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "PostComments [id=" + id + ", comentContent=" + comentContent + "]";
	}

}
