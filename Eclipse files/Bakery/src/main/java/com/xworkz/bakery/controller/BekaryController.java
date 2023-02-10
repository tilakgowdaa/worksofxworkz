package com.xworkz.bakery.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BekaryDTO;
import com.xworkz.bakery.service.BekaryService;

@Controller
@RequestMapping("/cake")
public class BekaryController {
	@Autowired
	private BekaryService bekaryService;
	
	public BekaryController() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onBekary(BekaryDTO bekaryDto,Model model) {
		System.out.println("running onBekary "+ bekaryDto);
		model.addAttribute("name", bekaryDto.getName());
		model.addAttribute("ownerName", bekaryDto.getOwnerName());
		model.addAttribute("wifeName", bekaryDto.getWifeName());
		model.addAttribute("married", bekaryDto.isMarried());
		model.addAttribute("famousFor", bekaryDto.getFamousFor());
		model.addAttribute("since", bekaryDto.getSince());
		boolean saved = this.bekaryService.validateAndSave(bekaryDto);
		System.out.println("saved"+saved);
		return "bekary.jsp";
	}

}
