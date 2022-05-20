package com.rest.api.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rest.api.domain.model.Client;
import com.rest.api.domain.repository.ClientRepository;
import com.rest.api.exceptionhandler.BusinessException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CatalogClientService {

	private ClientRepository clientRepository;
	
	@Transactional
	public Client save(Client client) {
		boolean emailExist = clientRepository.findByEmail(client.getEmail())
				.stream().anyMatch(clientExist -> !clientExist.equals(client));
		
		if(emailExist) {
			throw new BusinessException("Já existe um cliente cadastrado com esse e-mail.");
		}
		
		
		return clientRepository.save(client);
	}
	
	@Transactional
	public void delete(Long id) {
		clientRepository.deleteById(id);
	}
}
