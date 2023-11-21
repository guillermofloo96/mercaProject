package com.example.mercaweb.domain.Pojo.service;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService{
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
    public boolean delete(Integer idProducto) {
        return false;
    }
}
