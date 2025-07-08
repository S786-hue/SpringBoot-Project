package com.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.Profile;


public interface ProfileRepository extends JpaRepository<Profile, Long> {}

