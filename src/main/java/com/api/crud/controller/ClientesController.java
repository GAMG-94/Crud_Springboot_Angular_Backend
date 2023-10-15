package com.api.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.crud.model.Clientes;
import com.api.crud.service.ClientesService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
public class ClientesController {
	
	@Autowired
	private ClientesService clienteService;

	@PostMapping("/nuevo")
	public Clientes newClientes(@RequestBody Clientes newClientes) {
		return this.clienteService.newCliente(newClientes);
	}
	
	@GetMapping("/listar")
	public Iterable <Clientes> getAll() {
		return clienteService.getAll();
	}
	
	@PutMapping("/actualizar")
	public Clientes updateCliente(@RequestBody Clientes cliente) {
		return this.clienteService.clientesMod(cliente);
	}
	
	@DeleteMapping(value = "/borrar/{id}")
	public Boolean eliminarCliente (@PathVariable(value = "id") Integer idCliente) {
		return this.clienteService.borrarClientes(idCliente);
	}	
}
