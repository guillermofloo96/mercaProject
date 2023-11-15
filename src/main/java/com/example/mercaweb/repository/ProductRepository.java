package com.example.mercaweb.repository;

import com.example.mercaweb.domain.Pojo.ProductoPojo;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<ProductoPojo> getAll();

    Optional<ProductoPojo> getProducto(Integer id);
    ProductoPojo save(ProductoPojo productoPojo);

}
