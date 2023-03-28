package com.xworkz.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.XworkzAppDto;
import com.xworkz.service.XworkzAppService;

@Controller
@RequestMapping("/")
public class XworkzAppController {

	@Autowired
	private XworkzAppService xworkzAppService;

	public XworkzAppController() {
		System.out.println("Running Controller");
	}

	@PostMapping("/signUp")
	public String onSignUp(XworkzAppDto xworkzAppDto, Model model) {
		System.out.println("Running onSignUp");
		Set<ConstraintViolation<XworkzAppDto>> violation = this.xworkzAppService.validate(xworkzAppDto);
		System.out.println("Size :" + violation.size());
		violation.forEach(cv -> System.out.println(cv.getMessage()));
		if (violation.isEmpty()) {
			List<XworkzAppDto> dto = this.xworkzAppService.findAllService();
			for (XworkzAppDto Dto : dto) {
				if (xworkzAppDto.getUserId().equals(Dto.getUserId())) {
					model.addAttribute("userMsg", "UserID already exists");
					return "index";
				} else if (xworkzAppDto.getEmail().equals(Dto.getEmail())) {
					model.addAttribute("emailMsg", "Email already exists");
					return "index";
				} else if (xworkzAppDto.getMobileNo().equals(Dto.getMobileNo())) {
					model.addAttribute("mobileMsg", "MobileNo already exists");
					return "index";
				}
			}
			if (xworkzAppDto.getPassword().equals(xworkzAppDto.getConfirmPassword())) {
				boolean saved = this.xworkzAppService.saveService(xworkzAppDto);
				System.out.println("Saved :" + saved);
				model.addAttribute("success", "SignedUp Successfully");
				return "index";
			} else {
				model.addAttribute("passwordMsg", "Password does not match");
				return "index";
			}

		}

		model.addAttribute("violation", violation);
		return "index";

	}
}
