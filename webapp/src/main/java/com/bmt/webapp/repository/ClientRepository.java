package com.bmt.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmt.webapp.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
	public Client findByEmail(String email);
	

}
