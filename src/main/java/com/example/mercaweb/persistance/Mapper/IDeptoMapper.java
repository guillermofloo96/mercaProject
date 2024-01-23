package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.persistance.Entity.AdminEntity;
import com.example.mercaweb.persistance.Entity.DeptoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDeptoMapper {


    @Mapping(target = "municipioEntities", ignore = true)
    DeptoEntity DEPTO_ENTITY (DeptoDto deptoDto);
    DeptoDto DEPTO_DTO(DeptoEntity deptoEntity);

    List<DeptoDto> deptoList (List<DeptoEntity> deptoEntityList);
}
