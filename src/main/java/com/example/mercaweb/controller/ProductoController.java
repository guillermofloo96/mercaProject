package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.ProductoDto;
import com.example.mercaweb.domain.useCase.IProductoCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/productos")
public class ProductoController {

    private final IProductoCase iProductoCase;

    /*
    Devuelve un listado de productos
    retorna un httpcode ok con lista de prodcutos
     */
@GetMapping
    public ResponseEntity<List<ProductoDto>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(iProductoCase.getAll());
    }
/*
devueve una marca coche

 */
    @GetMapping(path = "/{id}")
    public ResponseEntity<ProductoDto> getProducto(@PathVariable Integer id){
    return ResponseEntity.of(iProductoCase.getProducto(id));


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
    public ResponseEntity<ProductoDto> save(@RequestBody  ProductoDto prodcutoNew){

        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iProductoCase.save(prodcutoNew));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    /*
    actualiza un nuevo producto
    devuelve un
     */
    @PatchMapping
    public ResponseEntity<ProductoDto> update(@RequestBody  ProductoDto productoPojoUpdate){
    return ResponseEntity.of(iProductoCase.update(productoPojoUpdate));
    }

    /*
    elimina un producto
    el parametro id del producto a eliminar
    retorna un httpcode ok si elimino el producto , httpdoce no found si no existe

     */
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
    return new ResponseEntity<>(this.iProductoCase.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }




}
 