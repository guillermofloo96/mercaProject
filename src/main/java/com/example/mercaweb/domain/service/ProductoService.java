package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.ProductoDto;

import com.example.mercaweb.domain.irepository.IProductRepository;
import com.example.mercaweb.domain.useCase.IProductoCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductoService implements IProductoCase {

    /*
    repository de Producto
     */

    /**
     *
     */
    private final IProductRepository iProductRepository;
    @Override
    public List<ProductoDto> getAll() {

        return  iProductRepository.getAll();
    }

    @Override
    public Optional<ProductoDto> getProducto(Integer id) {

        return iProductRepository.getProducto(id);
    }

    @Override
    public ProductoDto save(ProductoDto productoDto) {
        return iProductRepository.save(productoDto);
    }

    @Override
    public Optional<ProductoDto> update(ProductoDto productoDto) {
        if(iProductRepository.getProducto(productoDto.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iProductRepository.save(productoDto));
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
