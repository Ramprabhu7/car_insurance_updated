package com.car.Insurance.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.car.Insurance.Service.InsuranceService;
import com.car.Insurance.model.Insurance;

@Controller
public class InsuranceController {
	InsuranceService service;
	@Autowired
	public InsuranceController(InsuranceService service) {
		super();
		this.service = service;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringtrimmereditor=new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringtrimmereditor);
	}

	@GetMapping("/")
	public String showhome(Model model) {
		Insurance insurance=new Insurance();
		insurance.setName("ram");
		model.addAttribute(insurance);
		return "detail";
	}
	
	@GetMapping("/page1")
	public String showpage1(Model model) {
		List<String> companyname=service.getCompanyName();
		model.addAttribute("company1", companyname.get(0));
		return "page1";
	}
	
	@GetMapping("/page2")
	public String showpage2(Model model) {
		List<String> companyname=service.getCompanyName();
		model.addAttribute("company2", companyname.get(1));
		return "page2";
	}
	
	@GetMapping("/page3")
	public String showpage3(Model model) {
		List<String> companyname=service.getCompanyName();
		model.addAttribute("company3", companyname.get(2));
		return "page3";
	}
	
	@GetMapping("/process")
	public String processForm(@Valid @ModelAttribute("insurance") Insurance insurance, @RequestParam("modelName") String modelName,@RequestParam("fuelType") String fuelType,
			 @RequestParam("year") String year,Model model) throws ParseException {
		
		int no_month=service.getmonth(insurance.getYear());
		int no_year=service.getyear(year);
		//list containing all company name
		List<String> companyname=service.getCompanyName();
		//list containing all premium amount
		List<Long> premium1=service.getPremium1(modelName,fuelType,no_month,no_year);
		//list containing all IDV values
		List<Long> IDV1=service.getIDV1(modelName,fuelType,no_month,no_year);
		model.addAttribute("company1", companyname.get(0));
		model.addAttribute("premium1", premium1.get(0));
		model.addAttribute("IDV1", IDV1.get(0));
		model.addAttribute("company2", companyname.get(1));
		model.addAttribute("premium2", premium1.get(1));
		model.addAttribute("IDV2", IDV1.get(1));
		model.addAttribute("company3", companyname.get(2));
		model.addAttribute("premium3", premium1.get(2));
		model.addAttribute("IDV3", IDV1.get(2));
		return "display";
		}
		
}
