package com.blogapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapp.entity.Station;

public interface StationRepository extends JpaRepository<Station,Long>{

	

}
