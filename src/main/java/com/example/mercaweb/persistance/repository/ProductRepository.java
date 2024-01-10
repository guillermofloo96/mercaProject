package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.ProductoDto;
import com.example.mercaweb.domain.repository.IProductRepository;
import com.example.mercaweb.persistance.Entity.ProductoEntity;
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
    private final com.example.mercaweb.persistance.Mapper.IProductoMapper IProductoMapper;

@Override
    public List<ProductoDto> getAll() {
    return IProductoMapper.toProductoPojo(crudProductRepository.findAll());
}

    @Override
    public Optional<ProductoDto> getProducto(Integer id) {
    return crudProductRepository.findById(id)
            .map(IProductoMapper::toproductoPojo);

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
        ProductoEntity productoEntity= IProductoMapper.productoEmtity(productoDto);
        return IProductoMapper.toproductoPojo(crudProductRepository.save(productoEntity));
    }


    @Override
    public void delete(Integer idProducto) {
    crudProductRepository.deleteById(idProducto);
    }
}
