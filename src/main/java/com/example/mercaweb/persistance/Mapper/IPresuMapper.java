package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.PresupuestoDto;
import com.example.mercaweb.persistance.Entity.AdminEntity;
import com.example.mercaweb.persistance.Entity.PresupuestoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPresuMapper {


    PresupuestoDto PRESUPUESTO_DTO(PresupuestoEntity presupuestoEntity);
    @Mapping(target = "usuarioEntity", ignore = true  )
    PresupuestoEntity PRESUPUESTO_ENTITY(PresupuestoDto presupuestoDto);

    List<PresupuestoDto> PRESUPUESTO_DTO_LIST (List<PresupuestoEntity> presupuestoEntities);


}
