package com.xworkz.egg.controller;

import java.util.Set; 

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CmDTO;
import com.xworkz.egg.service.CmService;

@Controller
@RequestMapping("/cm")
public class CmController {

	@Autowired
	private CmService cmService;
	
	public CmController() {
	System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCm(CmDTO cmDTO,Model model) {
		System.out.println("Running onCm method");
		
		Set<ConstraintViolation<CmDTO>> constraintViolations= this.cmService.validateAndSave(cmDTO);
		if(!constraintViolations.isEmpty()) {
			System.out.println("Validation failed,Display the messages:");
			constraintViolations.forEach((cv)->System.out.println(cv.getMessage()));
		}else {
			System.out.println("Validation success");
		}
		return "index";
	}
}
