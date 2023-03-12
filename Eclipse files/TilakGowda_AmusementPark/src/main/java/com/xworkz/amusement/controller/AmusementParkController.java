package com.xworkz.amusement.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.amusement.dto.AmusementParkDTO;
import com.xworkz.amusement.service.AmusementParkService;

@Controller
@RequestMapping("/")
public class AmusementParkController {

	@Autowired
	private AmusementParkService amusementParkService;

	private List<String> type = Arrays.asList("Student", "Adult", "Children");

	public AmusementParkController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/park")
	public String onPark(Model model, AmusementParkDTO amusementParkDTO) {
		System.out.println("Running get method onPark");
		model.addAttribute("type", type);
		return "AmusementPark";
	}

	@PostMapping("/park")
	public String onAmusement(Model model, AmusementParkDTO amusementParkDTO) {
		System.out.println("Running onAmusement post method");
		Set<ConstraintViolation<AmusementParkDTO>> violation = this.amusementParkService
				.validateAndSave(amusementParkDTO);
		if (!violation.isEmpty()) {
			model.addAttribute("cat", violation);
			violation.forEach((cv) -> System.out.println(cv.getMessage()));
			return "AmusementPark";
		}
		System.out.println("No violations");
		return "Success";

	}

	@PostMapping("/search")
	public String onSearch(Model model, @RequestParam int id) {
		System.out.println("Running onSearch");
		AmusementParkDTO dto = this.amusementParkService.findByID(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("msg", "ID not found");
		}
		return "Search";
	}

	@GetMapping("/findByName")
	public String onFindByName(Model model, @RequestParam String name) {
		System.out.println("Running onFindByName");

		List<AmusementParkDTO> list = this.amusementParkService.findByName(name);
		if (list != null && !list.isEmpty()) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("msg", "Data not found");
		}
		return "SearchByName";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("Running onUpdate");
		AmusementParkDTO dto = this.amusementParkService.findByID(id);
		model.addAttribute("dto", dto);
		model.addAttribute("type", type);

		return "Update";
	}

	@PostMapping("/update")
	public String onUpdate(Model model, AmusementParkDTO amusementParkDTO) {
		System.out.println("Running onUpdate post");
		Set<ConstraintViolation<AmusementParkDTO>> violtion = this.amusementParkService
				.validateAndUpdate(amusementParkDTO);
		if (!violtion.isEmpty()) {
			model.addAttribute("err", violtion);
			return "Update";
		} else {
			model.addAttribute("msg", "Updated Successfully");
			return "Update";
		}
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("Running onDelete");
		boolean delete = this.amusementParkService.validateAnddelete(id);
		if (delete = true) {
			System.out.println("deleted data of :" + id);
			model.addAttribute("delete", "Deleted successfully : ID : ");
			model.addAttribute("id", id);
		} else {
			model.addAttribute("notDeleted", "Id not found");
		}
		return "SearchByName";
	}

	@GetMapping("/findAll")
	public String onFindAll(Model model) {
		System.out.println("Running onFindAll");
		List<AmusementParkDTO> dto = this.amusementParkService.findAll();
		model.addAttribute("dto", dto);
		return "AllParks";
	}

	@GetMapping("/findByNameAndPrice")
	public String onFindByNameAndPrice(@RequestParam String name, @RequestParam double entryFee, Model model) {
		System.out.println("Running onFindByNameAndPrice");
		System.out.println("name:"+name+"price"+entryFee);
		if (name.isEmpty() && entryFee != 0) {
			List<AmusementParkDTO> dtoP = this.amusementParkService.validateAndfindByPrice(entryFee);
			System.out.println(dtoP.size());
			if (dtoP.size()!=0) {
				model.addAttribute("dto", dtoP);
				return "NameAndPrice";
			} else {
				model.addAttribute("msg1", "Data Not found");
				return "NameAndPrice";
			}

		} else if (!name.isEmpty() && entryFee == 0) {
			List<AmusementParkDTO> dtoN = this.amusementParkService.findByName(name);
			if (dtoN.size()!=0) {
				model.addAttribute("dtoN", dtoN);
				return "NameAndPrice";
			} else {
				model.addAttribute("msg2", "Data Not found");
				return "NameAndPrice";
			}
		} else {
			List<AmusementParkDTO> dtoNP = this.amusementParkService.findByNameAndPrice(name, entryFee);

			if (dtoNP.size()!=0) {
				model.addAttribute("dtoNP", dtoNP);
				return "NameAndPrice";
			} else {
				model.addAttribute("msg3", "Data Not found");
				return "NameAndPrice";
			}

		}
	}
	
	@GetMapping("/deleteInAll")
	public String onDeleteInAll(@RequestParam int id, Model model) {
		System.out.println("Running onDelete");
		boolean delete = this.amusementParkService.validateAnddelete(id);
		if (delete = true) {
			System.out.println("deleted data of ID:" + id);
			model.addAttribute("delete", "Deleted data of ID : "+id+" successfully");
			model.addAttribute("id", id);
		} 
		return "AllParks";
	}
	
	@GetMapping("/deleteInNP")
	public String onDeleteInNP(@RequestParam int id, Model model) {
		System.out.println("Running onDelete");
		boolean delete = this.amusementParkService.validateAnddelete(id);
		if (delete = true) {
			System.out.println("deleted data of ID:" + id);
			model.addAttribute("delete", "Deleted data of ID : "+id+" successfully");
			model.addAttribute("id", id);
		} 
		return "NameAndPrice";
	}
}
