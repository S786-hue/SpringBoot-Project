package com.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app1.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
