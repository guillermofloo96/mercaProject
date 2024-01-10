package com.example.mercaweb.persistance.Mapper;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.persistance.Entity.AdminEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IAdminMapper {

    AdminEntity  ADMIN_ENTITY (AdminDteo adminDteo);
    AdminDteo ADMIN_DTEO(AdminEntity adminEntity);

    List<AdminDteo> adminDtolist (List<AdminEntity> adminEntityList);
}
