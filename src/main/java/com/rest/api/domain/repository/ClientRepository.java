package com.rest.api.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.domain.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

	Optional<Client> findByEmail(String email);
}
