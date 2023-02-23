package com.xworkz.aeroplane.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService service;

	List<String> type = Arrays.asList("Piston Aircraft", "Light jets", "Heavy jets");
	List<String> country = Arrays.asList("India", "USA", "UAE", "Japan", "Russia");

	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/plane")
	public String onAeroplaneInfo(Model model) {
		System.out.println("Running onAeroplaneInfo");
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Aeroplane";
	}

	@PostMapping("/plane")
	public String onAeroplane(Model model, AeroplaneDTO aeroplaneDTO) {
		System.out.println("Running onAeroplane");
		Set<ConstraintViolation<AeroplaneDTO>> violations = this.service.validateAndSave(aeroplaneDTO);
		if (!violations.isEmpty()) {
			System.out.println("Violations : ");
			violations.forEach((cv) -> System.err.println(cv.getMessage()));
			model.addAttribute("dto", aeroplaneDTO);
			model.addAttribute("violation", violations);
			model.addAttribute("type", type);
			model.addAttribute("country", country);
			return "Aeroplane";
		}
		System.out.println("No violation are found");
		return "AeroplaneSuccess";

	}
	
	@GetMapping("/search")
	public String onSearch(Model model,@RequestParam int id) {
		System.out.println("Runnig onSearch");
		AeroplaneDTO aeroplaneDTO= this.service.findById(id);
		if(aeroplaneDTO!=null) {
			model.addAttribute("DTO",aeroplaneDTO);
		}else {
			model.addAttribute("msg","Do not Found");
		}
		return "AeroplaneSearch";
	}
}
