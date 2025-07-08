package com.blogapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String content;
	
	@ManyToOne
	@JoinColumn(name="post_id")
	private Post post;
	
	
	
	public long getId() {
		return id;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
