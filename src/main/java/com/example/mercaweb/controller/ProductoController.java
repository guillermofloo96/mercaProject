package com.example.mercaweb.controller;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.service.IProductoService;
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

    /*
    Devuelve un listado de productos
    retorna un httpcode ok con lista de prodcutos
     */
@GetMapping
    public ResponseEntity<List<ProductoPojo>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(iProductoService.getAll());
    }
/*
devueve una marca coche

 */
    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductoPojo> getProducto(@PathVariable Integer id){
    return ResponseEntity.of(iProductoService.getProducto(id));


    /*
        @GetMapping(path = "/{id}")
    public ResponseEntity<ProductoPojo> getProducto(@PathVariable Integer id){
    return ResponseEntity.of(iProductoService.getProducto(id));
     */
    }
/*
        Guarda un nuevo producto
 */
    @PostMapping
    public ResponseEntity<ProductoPojo> save(@RequestBody  ProductoPojo prodcutoNew){

        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iProductoService.save(prodcutoNew));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    /*
    actualiza un nuevo producto
    devuelve un
     */
    @PutMapping
    public ResponseEntity<ProductoPojo> update(@RequestBody  ProductoPojo productoPojoUpdate){
    return ResponseEntity.status(HttpStatus.OK).body(iProductoService.save(productoPojoUpdate));
    }

    /*
    elimina un producto
    el parametro id del producto a eliminar
    retorna un httpcode ok si elimino el producto , httpdoce no found si no existe

     */
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
    return new ResponseEntity<>(this.iProductoService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }




}
 