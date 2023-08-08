package com.edyalves.app01.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edyalves.app01.domain.Usuario;
import com.edyalves.app01.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Usuario> find(Integer id) {
		Usuario obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
