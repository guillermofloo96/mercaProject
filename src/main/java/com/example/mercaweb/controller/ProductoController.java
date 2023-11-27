package com.example.mercaweb.controller;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.Pojo.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    /*
        @GetMapping(path = "/{id}")
    public ResponseEntity<ProductoPojo> getProducto(@PathVariable Integer id){
    return ResponseEntity.of(iProductoService.getProducto(id));
     */
    }

    public ResponseEntity<ProductoPojo> save(@RequestBody  ProductoPojo prodcutoNew){

        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iProductoService.save(prodcutoNew));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

    }





}
