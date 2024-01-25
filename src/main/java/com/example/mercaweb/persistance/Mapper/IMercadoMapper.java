package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.persistance.Entity.MercadoEntity;
import com.example.mercaweb.persistance.Entity.MunicipioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMercadoMapper {


    @Mapping(target = "municipioEntity", ignore = true  )
    MercadoEntity MERCADO_ENTITY(MercadoDteo mercadoDteo);
    MercadoDteo  MERCADO_DTEO(MercadoEntity mercadoEntity);

    List<MercadoDteo> MERCADO_DTO_LIST (List<MercadoEntity> municipioEntity);

}
