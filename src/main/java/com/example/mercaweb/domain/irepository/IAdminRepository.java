package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.AdminDteo;

import java.util.List;
import java.util.Optional;

public interface  IAdminRepository {


    List<AdminDteo> getAll();

    Optional<AdminDteo> getAdmin(Integer id);
    Optional<AdminDteo> getAdminByEmail(String email);
    AdminDteo save(AdminDteo adminDteo);


    void delete(Integer idadmin);
}
