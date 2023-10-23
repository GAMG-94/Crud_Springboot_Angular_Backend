package com.api.crud.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_producto;
    private String nom_producto;
    private Double precio;
    private Integer cantidad;
    private String proveedor;

}
