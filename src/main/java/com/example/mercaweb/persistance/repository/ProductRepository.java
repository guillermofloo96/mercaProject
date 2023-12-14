package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.ProductoDto;
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
    public List<ProductoDto> getAll() {
    return productoMapper.toProductoPojo(crudProductRepository.findAll());
}

    @Override
    public Optional<ProductoDto> getProducto(Integer id) {
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
    public ProductoDto save(ProductoDto productoDto) {
        ProductoEntity productoEntity= productoMapper.productoEmtity(productoDto);
        return productoMapper.toproductoPojo(crudProductRepository.save(productoEntity));
    }


    @Override
    public void delete(Integer idProducto) {
    crudProductRepository.deleteById(idProducto);
    }
}
