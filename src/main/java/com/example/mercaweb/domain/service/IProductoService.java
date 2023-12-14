package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.ProductoDto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    List<ProductoDto> getAll();

    Optional<ProductoDto> getProducto(Integer id);
    ProductoDto save(ProductoDto productoDto);

    Optional<ProductoDto> update(ProductoDto productoDto);

    boolean delete(Integer idProducto);
}
