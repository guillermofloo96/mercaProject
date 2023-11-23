package com.example.mercaweb.controller;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.Pojo.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/productos")
public class ProductoController {

    private final IProductoService iProductoService;
@GetMapping
    public ResponseEntity<List<ProductoPojo>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(iProductoService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductoPojo> getProducto(@PathVariable Integer id){
    return ResponseEntity.of(iProductoService.getProducto(id));


    }




}
