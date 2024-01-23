package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.dto.UsuarioDto;

import java.util.List;
import java.util.Optional;

public interface IUsuarioCaseUseService {

    List<UsuarioDto> getAll();

    Optional<UsuarioDto> getUsuarioById(Integer id);

    UsuarioDto save(UsuarioDto usuarioDto);
    Optional<UsuarioDto> update(UsuarioDto usuarioDto);

    boolean delete(Integer id);
}
