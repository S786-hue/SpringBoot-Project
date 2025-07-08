package com.app1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app1.dto.DoctorDto;

import com.app1.entity.Doctor;
import com.app1.entity.DoctorsAddress;

import com.app1.repository.DoctorRepository;
import com.app1.repository.DoctorsAddressRepostiory;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	DoctorsAddressRepostiory doctorsAddressRepository;
	
	public void saveDoctorsDetails(DoctorDto doctorDto) {
		Doctor doctor=new Doctor();
		BeanUtils.copyProperties(doctorDto, doctor);
		doctorRepository.save(doctor);
		
		
		DoctorsAddress doctorsAddress = new DoctorsAddress();
		BeanUtils.copyProperties(doctorDto, doctorsAddress);
		doctorsAddressRepository.save(doctorsAddress);
	}
	
	public List<Doctor>getRegistration(){
		List<Doctor> doctors= doctorRepository.findAll();
		return doctors;
	}
	public void deleteRegistrationById(long id) {
		doctorRepository.deleteById(id);
	}
	
	public Doctor getRegistrationByid(long id) {
		Optional<Doctor> opDoc = doctorRepository.findById(id);
	    return opDoc.get();
	}
	
	

	

}
