package com.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app1.entity.DoctorsAddress;

public interface DoctorsAddressRepostiory extends JpaRepository<DoctorsAddress, Long> {

}
