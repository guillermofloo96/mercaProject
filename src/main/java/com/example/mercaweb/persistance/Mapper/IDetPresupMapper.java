package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.DetPresupuestoDto;
import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.persistance.Entity.DetPresupEntity;
import com.example.mercaweb.persistance.Entity.DetProdcutoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IDetPresupMapper {

    @Mapping(target = "presupuestoEntity", ignore = true  )
    @Mapping(target = "detProdcutoEntity", ignore = true  )
    DetPresupEntity DET_PRESUP_ENTITY(DetPresupuestoDto detPresupuestoDto);
    DetPresupuestoDto  DET_PRESUPUESTO_DTO(DetPresupEntity detPresupEntity);

    List<DetPresupuestoDto> DET_PRESUPUESTO_DTOS (List<DetPresupEntity> detPresupEntities);
}
