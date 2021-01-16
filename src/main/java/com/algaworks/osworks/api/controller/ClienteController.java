package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Alice");
		cliente1.setEmail("alice@gmail.com");
		cliente1.setTelefone("11 44444-4444");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("João");
		cliente2.setEmail("joao@gmail.com");
		cliente2.setTelefone("11 88888-8888");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
