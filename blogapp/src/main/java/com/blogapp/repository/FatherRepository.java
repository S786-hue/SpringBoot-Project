package com.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.Father;

public interface FatherRepository extends JpaRepository<Father,Long> {
	

}
