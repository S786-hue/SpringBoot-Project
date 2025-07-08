package com.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app1.controller.utils.EmailSender;
import com.app1.dto.ForcesDto;
import com.app1.entity.Forces;
import com.app1.service.ForcesService;



@Controller
public class ForcesController {
	private static final Object forces = null;
	@Autowired
	ForcesService forcesService;
	
	@Autowired
	private EmailSender emailSender;
	
	@RequestMapping("/forceview")
	public String showArmy() {
		return "forces";
	}
	
	@RequestMapping("/saveforces")
	public String saveArmyData(@ModelAttribute  ForcesDto frocesDto, Model model) {
		
		forcesService.saveArmyData(frocesDto);
		emailSender.sendEmail(frocesDto.getEmail(), "Test", "Registration done!!");
		model.addAttribute("msg", "Data is Saved");
		
		return "forces";
		
	}
	
	@RequestMapping("/forceregistrationlist")
	public String getArmyRegistrationList(ModelMap model){
		     List<Forces> forces = forcesService.getRegistration();
		     model.addAttribute("forces", forces);
		     return "forceslist";
	}
	
	@RequestMapping("/delforceregistration")
	public String deleteArmyRegistration(@RequestParam long id, Model model) {
		
		forcesService.deleteRegistration(id);
		List<Forces> forces = forcesService.getRegistration();
		model.addAttribute("forces", forces);
		return "forceslist";
	}
	
	@RequestMapping("/updateforce")
	public String updateRegistration(@RequestParam long id, ModelMap model) {
		     Forces forces = forcesService.showupdateRegistration(id);
		   model.addAttribute("forces", forces);
		
		return "forcesUpdate";
		
	}
	
	@RequestMapping("/updateforcesReg")
	public String updateRegistrationForce(@ModelAttribute ForcesDto forcesDto, Model model) {
		      forcesService.updateRegistrationForce(forcesDto);
		      
		       List<Forces> forces= forcesService.getRegistration();
		       model.addAttribute("forces",forces);
		
		      return "forceslist";
		
	}
	
	

	
	

}
