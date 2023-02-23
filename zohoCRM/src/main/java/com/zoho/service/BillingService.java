package com.zoho.service;

import java.util.List;

import com.zoho.entites.BillingContacts;

public interface BillingService {
	
	public void saveContacts(BillingContacts billingcontacts);

	public List<BillingContacts> getContactsData();
	public BillingContacts getContactsById(long id);

}
