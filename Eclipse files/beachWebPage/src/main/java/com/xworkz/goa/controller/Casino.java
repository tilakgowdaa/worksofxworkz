package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/casino")
public class Casino {
	public Casino() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onCasino(CasinoDTO dto, Model model) {
		System.out.println("Running onCasino method");
		model.addAttribute("name", dto.getName());
		model.addAttribute("cruise", dto.getCruise());
		model.addAttribute("price", dto.getPrice());
		model.addAttribute("food", dto.getFood());
		model.addAttribute("alcohol", dto.getAlcohol());
		return "CasinoRedirect.jsp";
	}
}
