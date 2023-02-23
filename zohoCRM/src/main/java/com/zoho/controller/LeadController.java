package com.zoho.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zoho.entites.Lead;
import com.zoho.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService service;
	//http:localhost:8080/loginpageload
	@RequestMapping(value = "/loginpageload",method = RequestMethod.GET)
	public String loginPageLoad() {
		return "LoginPage";
	}
	
	@RequestMapping(value = "/saveLead",method = RequestMethod.POST)
	public String saveLeads(@Valid @ModelAttribute("lead") Lead lead,BindingResult result,Model model) {
		if(result.hasErrors()) {
			System.out.println(result);
			model.addAttribute("result", result);
			return "LoginPage";
		}
		service.saveLeads(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "Data Is Save");
		return "DisplayLead";
	}
						
	@RequestMapping("/listLeads")
	public String LeadData(Model model) {
		
		List<Lead> leads = service.getLeadData();
		model.addAttribute("leads", leads);
		return "LeadData";
	}
	
	@RequestMapping("/ledInfo")
	public String ledInfo(@RequestParam("id") long id,Model model) {
		Lead lead = service.getLeadById(id);
		model.addAttribute("lead", lead);
		return "DisplayLead";
	}
	
	
//	@RequestMapping("/convertLead")
//	public String convertLead(@RequestParam("id") long id) {
//		
//		return null;
//	}
}
