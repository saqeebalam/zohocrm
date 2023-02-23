package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entites.Contacts;
import com.zoho.entites.Lead;
import com.zoho.service.ContactsService;
import com.zoho.service.LeadService;

@Controller
public class ContactsController {
	
	@Autowired
	ContactsService contactService;
	
	@Autowired
	LeadService leadService;
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead = leadService.getLeadById(id);
		Contacts contacts=new Contacts();
		//System.out.println(lead.getFirstName());
		contacts.setFirstName(lead.getFirstName());
		contacts.setLastName(lead.getLastName());
		contacts.setMobile(lead.getMobile());
		contacts.setEmail(lead.getEmail());
		contacts.setSource(lead.getSource());
		contactService.saveContacts(contacts);
		leadService.deleteById(id);
		return "DisplayLead";
	}
	
	@RequestMapping("/listContacts")
	public String listContactsAll(Model model) {
		List<Contacts> contactsData = contactService.getContactsData();
		model.addAttribute("contactsData", contactsData);
		return "LeadContactData";
	}

}
