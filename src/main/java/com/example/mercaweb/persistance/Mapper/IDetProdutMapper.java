package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.persistance.Entity.DetProdcutoEntity;
import com.example.mercaweb.persistance.Entity.MercadoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface IDetProdutMapper {

    @Mapping(target = "productoEntity", ignore = true  )
    @Mapping(target = "tiendaEntity", ignore = true  )
    DetProdcutoEntity DET_PRODCUTO_ENTITY(DetProductoDto detProductoDto);
    DetProductoDto  DET_PRODUCTO_DTO(DetProdcutoEntity detProdcutoEntity);

    List<DetProductoDto> DET_PRODUCTO_DTOS (List<DetProdcutoEntity> detProdcutoEntitiesz);

}
