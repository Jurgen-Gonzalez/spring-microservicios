package com.jurgen.springboot.app.item.springbootservicioitem.controllers;

import java.util.List;

import com.jurgen.springboot.app.item.springbootservicioitem.models.Item;
import com.jurgen.springboot.app.item.springbootservicioitem.models.service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    

    @Autowired
    private ItemService itemService;

    @GetMapping("/listar")
    public List<Item> listar(){
        return itemService.findAll();

    }
    @GetMapping("/ver/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad){
        return itemService.findById(id, cantidad);

    }
}
