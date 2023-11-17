package com.example.mercaweb.domain.Pojo.repository;

import com.example.mercaweb.domain.Pojo.ProductoPojo;

import java.util.List;
import java.util.Optional;

public interface eProductRepository {

    List<ProductoPojo> getAll();

    Optional<ProductoPojo> getProducto(Integer id);
    ProductoPojo save(ProductoPojo productoPojo);

    void delete(Integer idProducto);

}