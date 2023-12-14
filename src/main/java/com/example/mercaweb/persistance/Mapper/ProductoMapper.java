package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.ProductoDto;
import com.example.mercaweb.persistance.Entity.ProductoEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

    @Mapping(source = "id",  target = "id")
    @Mapping(source = "nombres", target = "nombres")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "precio", target = "precio")
    @Mapping(source = "foto", target = "foto")
    ProductoEntity productoEmtity(ProductoDto productoDto);

    @InheritInverseConfiguration
    ProductoDto toproductoPojo(ProductoEntity productoEntity);

    List<ProductoDto> toProductoPojo(List<ProductoEntity> productoEntityList);
}
