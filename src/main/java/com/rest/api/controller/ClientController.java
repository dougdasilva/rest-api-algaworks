package com.rest.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.api.domain.model.Client;

@RestController
public class ClientController {
	
	@GetMapping("/clients")
	public List<Client> getAll() {
		Client client1 = new Client();
		client1.setId(1L);
		client1.setName("Goku");
		client1.setEmail("goku@gmail.com");
		client1.setFone("85 99999-9999");
		
		return Arrays.asList(client1);
	}

}
