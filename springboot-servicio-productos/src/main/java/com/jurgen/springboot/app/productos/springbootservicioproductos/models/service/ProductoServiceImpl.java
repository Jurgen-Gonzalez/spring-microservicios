package com.jurgen.springboot.app.productos.springbootservicioproductos.models.service;

import java.util.List;

import com.jurgen.springboot.app.productos.springbootservicioproductos.models.entity.Producto;
import com.jurgen.springboot.app.productos.springbootservicioproductos.models.entity.dao.ProductoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
    
}
