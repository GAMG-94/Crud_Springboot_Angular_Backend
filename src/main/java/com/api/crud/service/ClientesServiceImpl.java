package com.api.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.crud.model.Clientes;
import com.api.crud.repository.ClientesRepositoy;

@Service
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	private ClientesRepositoy clientesRepository;

	@Override
	public Clientes newCliente(Clientes newCliente) {
		return clientesRepository.save(newCliente);
	}

	@Override
	public Iterable<Clientes> getAll() {
		return this.clientesRepository.findAll();
	}

	@Override
	public Clientes clientesMod(Clientes clientes) {
		Optional<Clientes> encontrado = this.clientesRepository.findById(clientes.getId_cliente());
		if (encontrado.get() != null) {
			encontrado.get().setNombre_cliente(clientes.getNombre_cliente());
			encontrado.get().setApellido_cliente(clientes.getApellido_cliente());
			encontrado.get().setCorreo_cliente(clientes.getCorreo_cliente());
			
			return this.newCliente(encontrado.get());
		}
		return null;
	}

	@Override
	public Boolean borrarClientes(Integer idCliente) {
		this.clientesRepository.deleteById(idCliente);
		return true;
	}

}
