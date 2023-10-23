package com.api.crud.service;

import com.api.crud.model.Productos;
import com.api.crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductosServiceImpl implements ProductosService {

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public Productos newProduct(Productos newProductos) {
        return productoRepository.save(newProductos);
    }

    @Override
    public Iterable<Productos> getAll() {
        return this.productoRepository.findAll();
    }

    @Override
    public Productos productosMod(Productos productos) {
        Optional<Productos> encontrado = this.productoRepository.findById(productos.getId_producto());
        if (encontrado.get() != null) {
            encontrado.get().setNom_producto(productos.getNom_producto());
            encontrado.get().setCantidad(productos.getCantidad());
            encontrado.get().setPrecio(productos.getPrecio());
            encontrado.get().setProveedor(productos.getProveedor());
        }
        return this.newProduct(encontrado.get());
    }

    @Override
    public Boolean Productos(Integer idProducto) {
        this.productoRepository.deleteById(idProducto);
        return true;
    }
}
