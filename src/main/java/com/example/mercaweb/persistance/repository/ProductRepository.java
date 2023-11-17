package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.Pojo.repository.eProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductRepository implements eProductRepository {

    @Override
    public List<ProductoPojo> getAll() {
        return null;
    }

    @Override
    public Optional<ProductoPojo> getProducto(Integer id) {
        return Optional.empty();
    }

    @Override
    public ProductoPojo save(ProductoPojo productoPojo) {
        return null;
    }

    @Override
    public void delete(Integer idProducto) {

    }
}
