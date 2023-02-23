package com.zoho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho.entites.Contacts;

public interface ContactsRepositories extends JpaRepository<Contacts, Long> {

}
