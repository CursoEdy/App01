package com.edyalves.app01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.edyalves.app01.domain.Usuario;
import com.edyalves.app01.repositories.UsuarioRepository;

@SpringBootApplication
public class App01Application implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(App01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario user1 = new Usuario(null, "Usuer 01", "user-01@email.com");
		Usuario user2 = new Usuario(null, "Usuer 02", "user-02@email.com");
		
		usuarioRepository.saveAll(Arrays.asList(user1, user2));
	}

}
