package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.Pojo.ProductoPojo;
import com.example.mercaweb.persistance.Entity.ProductoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

    @Mapping(source = "id",  target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "descrip", target = "descrip")
    @Mapping(source = "precio", target = "precio")
    ProductoPojo productoPojo(ProductoEntity productoEntity);
    @InheritInverseConfiguration
    ProductoEntity productoEmtity(ProductoPojo productoPojo);
}
