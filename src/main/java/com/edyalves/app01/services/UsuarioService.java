package com.edyalves.app01.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edyalves.app01.domain.Usuario;
import com.edyalves.app01.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repo;
	
	public Usuario find (Integer id) {
		Optional<Usuario> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
