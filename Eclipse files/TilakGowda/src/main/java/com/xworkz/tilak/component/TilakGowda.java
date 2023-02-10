package com.xworkz.tilak.component;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.tilak.dto.BeverageDTO;
import com.xworkz.tilak.dto.ChatDTO;
import com.xworkz.tilak.dto.EducationDTO;
import com.xworkz.tilak.dto.FamilyDTO;
import com.xworkz.tilak.dto.MobileDTO;

@Component
@RequestMapping("/")
public class TilakGowda {
	public TilakGowda() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("email", "tilakgowda111@gmail.com");
		return "index.jsp";
	}

	@PostMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running onMobile");
		model.addAttribute("mobile", "9886684710");
		return "index.jsp";
	}

	@PostMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("Running onAadhar");
		model.addAttribute("aadhar", "516730465617");
		return "index.jsp";
	}

	@PostMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running onAge");
		model.addAttribute("age", 22);
		return "index.jsp";
	}

	@PostMapping("/dob")
	public String onDob(Model model) {
		System.out.println("Running onDob");
		model.addAttribute("dob", LocalDateTime.of(2000, 9, 25, 07, 45));
		return "index.jsp";
	}

	@PostMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("Running onSalary");
		model.addAttribute("salary", 30000);
		return "index.jsp";
	}

	@PostMapping("/friend")
	public String onFriends(Model model) {
		System.out.println("Running onFriends");
		List<String> ref = new ArrayList<String>();
		ref.add("Virat Kohli");
		ref.add("Rohit Sharma");
		ref.add("Ms Dhoni");
		model.addAttribute("friend", ref);
		return "index.jsp";
	}

	@PostMapping("/place")
	public String onPlaces(Model model) {
		System.out.println("Running onPlaces");
		List<String> ref = new ArrayList<String>();
		ref.add("Bangalore");
		ref.add("Mangalore");
		ref.add("Udupi");
		model.addAttribute("place", ref);
		return "index.jsp";
	}

	@PostMapping("/skill")
	public String onskills(Model model) {
		System.out.println("Running onSkills");
		List<String> ref = new ArrayList<String>();
		ref.add("Java");
		ref.add("HTML");
		ref.add("Servlets");
		model.addAttribute("skill", ref);
		return "index.jsp";
	}

	@PostMapping("/education")
	public String onEducation(Model model) {
		System.out.println("Running onEducation");
		EducationDTO dto = new EducationDTO();
		dto.setQualification("BE in Mechanical engineering");
		dto.setSchoolName("Dolphin public school");
		dto.setBePercentage(68.7);
		dto.setBranch("Mechanical");
		dto.setDiplomaCollege("SJP");
		dto.setDiplomaPercentage(59.7);
		dto.setEngineeringCollege("Sri krishna institute of technology");
		dto.setLearntJava(true);
		dto.setSslcPercentage(90.64);
		dto.setTrainingInstitute("x-workz");
		model.addAttribute("info", dto);
		return "index.jsp";
	}

	@PostMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running onFamily");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("Kempe Gowda");
		dto.setGrandFather("Thirumale Gowda");
		dto.setGrandMother("Lakshmamma");
		dto.setLivesIn("Bangalore");
		dto.setMarried(false);
		dto.setMotherName("Kalavathi");
		dto.setNoOfPeople(4);
		dto.setSiblingName("Vedha");
		dto.setSiblingRelation("Sister");
		dto.setSiblings(true);
		model.addAttribute("fam", dto);
		return "index.jsp";
	}

	@PostMapping("/mobiledto")
	public String onMobileDTO(Model model) {
		System.out.println("Running onMobileDTO");
		MobileDTO dto = new MobileDTO();
		dto.setCompany("Redmi");
		dto.setDualSim(false);
		dto.setModel("note 8 pro");
		dto.setNoOfSim(1);
		dto.setSimCompany("airtel");
		model.addAttribute("sim", dto);
		return "index.jsp";
	}

	@PostMapping("/juice")
	public String onJuice1(Model model) {
		System.out.println("Running onJuice");
		BeverageDTO dto = new BeverageDTO();
		dto.setAlcohol(false);
		dto.setBrand(" coco cola");
		dto.setColor("black");
		dto.setGoodForHealth(false);
		dto.setMadeOfFruit(false);
		dto.setPrice(40);
		dto.setQuantity(750);
		dto.setTastesGood(true);
		model.addAttribute("drink", dto);
		return "index.jsp";
	}

	@PostMapping("/chat")
	public String onChats(Model model) {
		System.out.println("Running onChats");
		ChatDTO dto = new ChatDTO();
		dto.setAvailable(true);
		dto.setDistance(3);
		dto.setGoodForHealth(false);
		dto.setLocation("bangalore");
		dto.setName("tikki puri");
		dto.setOwnerName("Lakshmi");
		dto.setPrice(30);
		dto.setShopClosesAt(LocalTime.of(10, 00));
		dto.setShopName("Lakshmi");
		dto.setShopOpensAt(LocalTime.of(05, 00));
		dto.setTastesGood(true);
		model.addAttribute("chat", dto);
		return "index.jsp";
	}
}
