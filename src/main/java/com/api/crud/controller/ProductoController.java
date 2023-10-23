package com.api.crud.controller;

import com.api.crud.model.Productos;
import com.api.crud.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductosService productosService;

    @PostMapping("/nuevo_producto")
    public Productos newProductos(@RequestBody Productos newProductos) {
        return this.productosService.newProduct(newProductos);
    }

    @GetMapping("/listar_productos")
    public Iterable <Productos> getAll() {
        return productosService.getAll();
    }

    @PutMapping("/actualizar_producto")
    public Productos modProductos(@RequestBody Productos productos) {
        return this.productosService.productosMod(productos);
    }

    @DeleteMapping("/borrar_producto/{id}")
    public Boolean borrarProducto(@PathVariable(value="id") Integer idProducto) {
        return this.productosService.borrarProductos(idProducto);
    }

}
