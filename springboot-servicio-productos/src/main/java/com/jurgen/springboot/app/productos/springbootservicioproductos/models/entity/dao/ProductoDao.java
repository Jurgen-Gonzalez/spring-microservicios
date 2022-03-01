package com.jurgen.springboot.app.productos.springbootservicioproductos.models.entity.dao;


import com.jurgen.springboot.app.productos.springbootservicioproductos.models.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
