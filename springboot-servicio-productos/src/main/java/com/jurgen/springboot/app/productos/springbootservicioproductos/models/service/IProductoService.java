package com.jurgen.springboot.app.productos.springbootservicioproductos.models.service;

import java.util.List;

import com.jurgen.springboot.app.productos.springbootservicioproductos.models.entity.Producto;

public interface IProductoService {
    
    public List<Producto> findAll();
    public Producto findById(Long id);
}
