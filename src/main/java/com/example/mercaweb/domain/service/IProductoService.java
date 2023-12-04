package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.Pojo.ProductoPojo;

import java.util.List;
import java.util.Optional;

public interface IProductoService {

    List<ProductoPojo> getAll();

    Optional<ProductoPojo> getProducto(Integer id);
    ProductoPojo save(ProductoPojo productoPojo);

    boolean delete(Integer idProducto);
}
