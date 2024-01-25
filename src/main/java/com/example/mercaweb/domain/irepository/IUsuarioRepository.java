package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.UsuarioDto;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository {
    List<UsuarioDto> getAll();

    Optional<UsuarioDto> getUsuarioById(Integer id);

    UsuarioDto save(UsuarioDto usuarioDto);


    void delete(Integer id);
}
