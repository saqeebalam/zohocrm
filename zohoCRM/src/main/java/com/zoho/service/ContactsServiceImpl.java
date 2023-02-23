package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entites.Contacts;
import com.zoho.repositories.ContactsRepositories;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepositories contactsRepo;
	
	@Override
	public void saveContacts(Contacts contacts) {
		
		contactsRepo.save(contacts);
	}

	@Override
	public List<Contacts> getContactsData() {
		List<Contacts> contacts = contactsRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts getContactsById(long id) {
		Optional<Contacts> findById = contactsRepo.findById(id);
		Contacts contacts = findById.get();
		return contacts;
	}

	

	

}
