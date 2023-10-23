package com.api.crud.service;

import com.api.crud.model.Productos;

public interface ProductosService {

    Productos newProduct(Productos newProductos);

    Iterable<Productos> getAll();

    Productos productosMod(Productos productos);

    Boolean borrarProductos(Integer id);

}
