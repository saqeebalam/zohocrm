package com.zoho.service;

import java.util.List;

import com.zoho.entites.Contacts;

public interface ContactsService {
	
	public void saveContacts(Contacts contacts);

	public List<Contacts> getContactsData();
	public Contacts getContactsById(long id);

}
