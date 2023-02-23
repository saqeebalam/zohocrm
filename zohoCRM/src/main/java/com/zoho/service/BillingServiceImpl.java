package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entites.BillingContacts;
import com.zoho.repositories.BillingRepositories;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepositories billingRepo;
	
	@Override
	public void saveContacts(BillingContacts billingcontacts) {
		
		billingRepo.save(billingcontacts);
	}

	@Override
	public List<BillingContacts> getContactsData() {
		List<BillingContacts> contacts = billingRepo.findAll();
		return contacts;
	}

	@Override
	public BillingContacts getContactsById(long id) {
		Optional<BillingContacts> findById = billingRepo.findById(id);
		BillingContacts contacts = findById.get();
		return contacts;
	}

	

	

}
