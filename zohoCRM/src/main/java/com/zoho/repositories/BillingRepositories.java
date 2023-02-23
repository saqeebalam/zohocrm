package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entites.BillingContacts;

public interface BillingRepositories extends JpaRepository<BillingContacts, Long> {

}
