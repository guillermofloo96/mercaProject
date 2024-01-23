package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.persistance.Entity.MunicipioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IMunicipioMapper {

    @Mapping(target = "deptoEntity", ignore = true  )
    MunicipioEntity MUNICIPIO_ENTITY(MunicipioDto municipioDto);
    MunicipioDto MUNICIPIO_DTO(MunicipioEntity municipioEntity);

    List<MunicipioDto> MUNICIPIO_DTO_LIST (List<MunicipioEntity> municipioEntity);
}
