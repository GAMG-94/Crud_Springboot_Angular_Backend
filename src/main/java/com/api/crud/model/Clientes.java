package com.api.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_cliente;
	
	private String nombre_cliente;
	
	private String apellido_cliente;
	
	private String correo_cliente;
}
