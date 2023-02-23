package com.zoho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entites.BillingContacts;
import com.zoho.entites.Contacts;
import com.zoho.service.BillingService;
import com.zoho.service.ContactsService;

@Controller
public class BillingController {
 
	@Autowired
	private ContactsService contactService;
	@Autowired
	private BillingService billingService;
	@RequestMapping("/billing")
	 public String getIdForBilling(@RequestParam("id") long id,Model model) {
		 
		 Contacts contactsById = contactService.getContactsById(id);
		 model.addAttribute("lead", contactsById);
		 return"BillingPage";
	 }
	
	@RequestMapping("/savebill")
	public String calculateBill(@RequestParam("id") long id,
								@RequestParam("firstName") String firstName,
								@RequestParam("lastName") String lastName,
								@RequestParam("product") String product,
								@RequestParam("amount") long amount,
								@RequestParam("gstTax") long gstTax) {
		BillingContacts bill=new BillingContacts();
		bill.setId(id);
		bill.setFirstName(firstName);
		bill.setLastName(lastName);
		bill.setProduct(product);
		bill.setAmount(amount);
		bill.setGstTax(gstTax);
		long gsttotal=amount+((amount*gstTax)/100);
		bill.setAmountGst(gsttotal);
		billingService.saveContacts(bill);
		return "BillingPage";
	}
	
	@RequestMapping("/listBillingContacts")
	public String listBillingContacts(Model model) {
		List<BillingContacts> contactsData = billingService.getContactsData();
		model.addAttribute("contactsData",contactsData);
		return "BillingContactData";
	}
}
