package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.dto.UsuarioDto;
import com.example.mercaweb.persistance.Entity.MunicipioEntity;
import com.example.mercaweb.persistance.Entity.UsuarioEntity;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IUsuarioMapper {
    UsuarioEntity USUARIO_ENTITY(UsuarioDto usuarioDto);
    UsuarioDto USUARIO_DTO(UsuarioEntity usuarioEntity);

    List<UsuarioDto> USUARIO_DTO_LIST (List<UsuarioEntity> usuarioEntities);
}
