package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.Pojo.repository.EProductRepository;
import com.example.mercaweb.persistance.Mapper.ProductoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public class ProductRepository implements EProductRepository {

    /*
    crud de prodcuto
     */
    private final CrudProductRepository crudProductRepository;
    /*
 maper del pruducto
     */
    private final ProductoMapper productoMapper;

@Override
    public List<ProductoPojo> getAll() {
    return productoMapper.toProductoPojo(crudProductRepository.findAll());
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
