package com.app1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Forces {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
    @Column(name="first_name", nullable=false)
	private String firstname;
    @Column(name="last_name", nullable=false)
	private String lastname;
    @Column(name="email", nullable=false, unique=true)
	private String email;
    @Column(name="mobile", nullable=false , unique=true)
	private String mobile;
    @Column(name="salary", nullable=false)
	private int salary;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    
    
	
}
