package com.algaworks.crm.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		cliente.setData_cadastro(new Date());
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletar (@PathVariable long id) {
		clienteRepository.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Cliente> editar(@RequestBody Cliente cliente,@PathVariable long id){
		Optional<Cliente> cli = clienteRepository.findById(id);
		
		if (!cli.isPresent())
			return ResponseEntity.notFound().build();
		
		cliente.setId(id);
		cliente.setData_cadastro(cli.get().getData_cadastro());
		clienteRepository.save(cliente);
		
		return ResponseEntity.ok().build();
		
	}
	
	
}
