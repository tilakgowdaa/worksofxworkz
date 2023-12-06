package com.xworkz.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.dto.XworkzAppDto;
import com.xworkz.service.XworkzAppService;

import lombok.extern.slf4j.Slf4j;

@EnableWebMvc
@Slf4j
@Controller
@RequestMapping("/")
public class XworkzAppController {

	@Autowired
	private XworkzAppService xworkzAppService;

	public XworkzAppController() {
		log.info("Running Controller");
	}

	@PostMapping("/signUp")
	public String onSignUp(XworkzAppDto xworkzAppDto, Model model) {
		log.info("Running onSignUp");
		Set<ConstraintViolation<XworkzAppDto>> violation = this.xworkzAppService.validate(xworkzAppDto);
		if(!violation.isEmpty()) {
		model.addAttribute("violation", violation);
		return "index";
		}
		violation.forEach(cv -> log.info(cv.getMessage()));
		else if(violation!=null && violation.isEmpty() && xworkzAppDto!=null) {
			model.addAttribute("Success", "Registered Successfully");
			return "index";

		} 

	}

	@GetMapping(value = "/userId/{user}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onUser(@PathVariable String user) {
		log.info("Running onUser in controller");
		Long dbUser = this.xworkzAppService.userIdCountService(user);
		log.info("" + dbUser);

		if (dbUser == 0) { 
			log.info("Running in equals condition");
			return "";

		} else {
			return "UserID exsist";
		}
	}
}
