package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICrudUsuario extends JpaRepository<UsuarioEntity, Integer> {

}
