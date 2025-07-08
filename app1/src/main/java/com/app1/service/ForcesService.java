package com.app1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app1.dto.ForcesDto;
import com.app1.entity.Address;
import com.app1.entity.Forces;
import com.app1.repository.AddressRepository;
import com.app1.repository.ForcesRepository;

@Service
public class ForcesService {
	@Autowired
	ForcesRepository forcesRepository;
	@Autowired
	AddressRepository addressRepository;
	
	public void saveArmyData(ForcesDto forcesDto) {
		
		Forces forces = new Forces();
		BeanUtils.copyProperties(forcesDto, forces);
		forcesRepository.save(forces);
		
		Address address = new Address();
		BeanUtils.copyProperties(forcesDto, address);
		addressRepository.save(address);
		
	}
	
	public List<Forces> getRegistration(){
		        List<Forces> forces = forcesRepository.findAll();
		     return forces;
	}
	public void deleteRegistration(long id) {
		forcesRepository.deleteById(id);
		
	}
	public Forces showupdateRegistration(long id){
		Optional<Forces> byId = forcesRepository.findById(id);
		return byId.get();
	}

	public void updateRegistrationForce(ForcesDto forcesDto) {
		Forces force=new Forces();
		BeanUtils.copyProperties(forcesDto, force);	
		forcesRepository.save(force);
		
	}

}
