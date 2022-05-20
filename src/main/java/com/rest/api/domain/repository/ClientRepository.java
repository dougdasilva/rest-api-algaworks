package com.rest.api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.domain.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	List<Client> findByEmail(String email);
}
