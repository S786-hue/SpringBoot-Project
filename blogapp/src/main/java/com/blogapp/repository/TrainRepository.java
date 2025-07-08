package com.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.Train;

public interface TrainRepository extends JpaRepository<Train,Long> {

}
