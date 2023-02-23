package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entites.Lead;
import com.zoho.repositories.LeadRepositories;

@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepositories leadRepo;
	
	@Override
	public void saveLeads(Lead lead) {
		
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getLeadData() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

	@Override
	public Lead getLeadById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead leads = findById.get();
		return leads;
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
	}

	

	

}
