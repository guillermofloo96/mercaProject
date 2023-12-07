package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.Pojo.ProductoPojo;

import com.example.mercaweb.domain.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductoService implements IProductoService{

    /*
    repository de Producto
     */

    /**
     *
     */
    private final IProductRepository iProductRepository;
    @Override
    public List<ProductoPojo> getAll() {

        return  iProductRepository.getAll();
    }

    @Override
    public Optional<ProductoPojo> getProducto(Integer id) {

        return iProductRepository.getProducto(id);
    }

    @Override
    public ProductoPojo save(ProductoPojo productoPojo) {
        return iProductRepository.save(productoPojo);
    }

    @Override
    public Optional<ProductoPojo> update(ProductoPojo productoPojo) {
        if(iProductRepository.getProducto(productoPojo.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iProductRepository.save(productoPojo));
    }

    @Override
    public boolean delete(Integer idProducto) {
        if(iProductRepository.getProducto(idProducto).isEmpty()){
            return false;
        }
        iProductRepository.delete(idProducto);
        return true;
    }
}
