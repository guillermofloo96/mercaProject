package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.domain.repository.IProductRepository;
import com.example.mercaweb.persistance.Entity.ProductoEntity;
import com.example.mercaweb.persistance.Mapper.ProductoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class ProductRepository implements IProductRepository {

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
    return crudProductRepository.findById(id)
            .map(productoMapper::toproductoPojo);

    /*
    crudProductRepository.findById(id)
            .map(productoEntity ->productoMapper.toproductoPojo(productoEntity));    lamba
     */
        /*
        crudProductRepository.findById(id)
            .map(productoMapper::toproductoPojo);  metodo por referencia
         */
    }

    @Override
    public ProductoPojo save(ProductoPojo productoPojo) {
        ProductoEntity productoEntity= productoMapper.productoEmtity(productoPojo);
        return productoMapper.toproductoPojo(crudProductRepository.save(productoEntity));
    }


    @Override
    public void delete(Integer idProducto) {
    crudProductRepository.deleteById(idProducto);
    }
}
