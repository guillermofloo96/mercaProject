package com.example.mercaweb.domain.Pojo.service;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.Pojo.repository.IProductRepository;
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
    public boolean delete(Integer idProducto) {
        try{
            iProductRepository.delete(idProducto);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
