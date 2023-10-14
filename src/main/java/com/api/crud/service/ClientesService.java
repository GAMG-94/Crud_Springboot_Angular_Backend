package com.api.crud.service;

import com.api.crud.model.Clientes;

public interface ClientesService {
	
	Clientes newCliente(Clientes newCliente);
	
	Iterable<Clientes> getAll();
	
	Clientes clientesMod(Clientes clientes);
	
	Boolean borrarClientes (Integer id);

}
