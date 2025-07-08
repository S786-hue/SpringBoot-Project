package com.blogapp.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Father {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	 @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "bussiness_id")  // FK in User table
	    private Bussiness bussiness;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bussiness getBussiness() {
		return bussiness;
	}

	public void setBussiness(Bussiness bussiness) {
		this.bussiness = bussiness;
	}
	 
	 

}
