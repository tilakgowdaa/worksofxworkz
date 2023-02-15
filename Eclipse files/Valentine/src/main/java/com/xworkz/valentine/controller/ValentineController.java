package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/day")
public class ValentineController {

	@Autowired
	private ValentineService service;

	List<String> places = Arrays.asList("Bangalore", "Mysore", "Shimoga");
	List<String> gifts = Arrays.asList("Phone", "Dress", "flower");

	public ValentineController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onValentine(Model model) {
		System.out.println("Running onValentine in getmapping");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "Valentine";
	}

	@PostMapping
	public String onValentine(Model model, ValentineDTO valentineDto) {
		System.out.println("Running onValentine in Postmapping");

		Set<ConstraintViolation<ValentineDTO>> violation = this.service.validateAndSave(valentineDto);
		if (!violation.isEmpty()) {
			System.out.println("Violations: ");
			violation.forEach((cv) -> System.err.println(cv.getMessage()));
			model.addAttribute("places", places);
			model.addAttribute("gifts", gifts);
			model.addAttribute("violation", violation);
			return "Valentine";
		}
		System.out.println("No violations");

		return "ValentineSuccess";

	}

}
