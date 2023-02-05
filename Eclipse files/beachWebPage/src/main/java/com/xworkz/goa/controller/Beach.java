package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class Beach {

	@PostMapping
	public String onBeach(BeachDTO beachDto, Model model) {
		System.out.println("Running onBeach method");
		model.addAttribute("name", beachDto.getName());
		model.addAttribute("location", beachDto.getLocation());
		model.addAttribute("clean", beachDto.getClean());
		model.addAttribute("games", beachDto.getGames());
		return "BeachRedirect.jsp";
	}
}
