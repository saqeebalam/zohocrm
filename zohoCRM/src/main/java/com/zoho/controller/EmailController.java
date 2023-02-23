package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	EmailService emailservice;
	
	@RequestMapping(value = "/emailPage",method = RequestMethod.POST)
	public String emailPage(@RequestParam("email") String email,Model model) {
		model.addAttribute("email", email);
		return "EmailPage";
	}
	
	@RequestMapping(value = "/sendMail",method = RequestMethod.POST)
	public String sendEmail(@RequestParam("email") String email,@RequestParam("subject") String subject,@RequestParam("field") String field,Model model) {
		emailservice.sendEmail(email, subject, field);
		model.addAttribute("msg", "Mail Sent Sucessfully...");
		return "EmailPage";
	}
}
