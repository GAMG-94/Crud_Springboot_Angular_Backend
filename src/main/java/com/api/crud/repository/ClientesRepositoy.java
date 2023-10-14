package com.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.model.Clientes;

@Repository
public interface ClientesRepositoy extends JpaRepository<Clientes, Integer> {

}
