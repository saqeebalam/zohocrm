package com.zoho.service;

import java.util.List;

import com.zoho.entites.Lead;

public interface LeadService {
	
	public void saveLeads(Lead lead);

	public List<Lead> getLeadData();
	public Lead getLeadById(long id);
	public void deleteById(long id);
	

}
