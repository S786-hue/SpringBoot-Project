package com.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {}
