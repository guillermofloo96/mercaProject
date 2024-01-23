package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.ResponseAdminDto;

import java.util.List;
import java.util.Optional;

/**
 * interfaz de servicio administradores
 */
public interface IAdminCase {

    /**
     * devuelve listas de todos los administradores
     * @return lista de administradores
     */
    List<AdminDteo> getAll();

    Optional<AdminDteo> getAdmin(Integer id);
    Optional<AdminDteo> getAdminByEmail(String email);
    ResponseAdminDto save(AdminDteo adminDteo);
    Optional<AdminDteo> update(AdminDteo adminDto);


    boolean delete(Integer idadmin);
}
