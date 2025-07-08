package com.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app1.dto.DoctorDto;
import com.app1.entity.Doctor;
import com.app1.repository.DoctorRepository;
import com.app1.service.DoctorService;

@Controller
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@RequestMapping("/viewDoctor")
	public String viewDoctorTable() {
		return "doctor";
	}
	
	@RequestMapping("/saveDoc")
	public String getDoctorAndAddress(@ModelAttribute  DoctorDto doctorDto, Model model) {
		
		doctorService.saveDoctorsDetails(doctorDto);
		model.addAttribute("msg", "Doctor Data is saved");
		return "doctor";
	}
	
	@RequestMapping("/listRegistration")
	public String viewDoctorRegistration(ModelMap model) {
		List<Doctor> doctors = doctorService.getRegistration();
		model.addAttribute("doctors", doctors);
		return "listdoctor";
	}
	
	@RequestMapping("/deleteRegistration")
	public String deleteRegistrationById(@RequestParam long id, Model model) {
		doctorService.deleteRegistrationById(id);
	     List<Doctor> doctors = doctorService.getRegistration();
	     model.addAttribute("doctors", doctors);
		return "listdoctor";
		
	}
	@RequestMapping("/getRegistration")
	public String updateRegistration(@RequestParam long id,ModelMap model) {
		Doctor doctors= doctorService.getRegistrationByid(id);
		model.addAttribute("doctors", doctors);
		return "updatedoctor";
	}
	
	   
	

	
	

}
