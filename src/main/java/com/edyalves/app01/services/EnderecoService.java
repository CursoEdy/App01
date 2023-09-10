package com.edyalves.app01.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyalves.app01.domain.Endereco;
import com.edyalves.app01.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repo;
	
	public Endereco find(Integer id) {
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
