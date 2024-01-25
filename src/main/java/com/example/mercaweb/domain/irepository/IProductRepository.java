package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.ProductoDto;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {


    List<ProductoDto> getAll();

    Optional<ProductoDto> getProducto(Integer id);
    ProductoDto save(ProductoDto productoDto);


    void delete(Integer idProducto);

}
