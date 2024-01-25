package com.example.mercaweb.persistance.repository;
import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.irepository.IAdminRepository;

import com.example.mercaweb.persistance.Crud.CrudAdminRepo;
import com.example.mercaweb.persistance.Mapper.IAdminMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class AdminRepo implements IAdminRepository {

    private final CrudAdminRepo crudAdminRepo;


    private  final IAdminMapper iAdminMapper;
    @Override
    public List<AdminDteo> getAll() {

        return iAdminMapper.adminDtolist(crudAdminRepo.findAll());
    }

    @Override
    public Optional<AdminDteo> getAdmin(Integer id) {
        return crudAdminRepo.findById(id)
                .map(iAdminMapper::ADMIN_DTEO);
    }

    @Override
    public Optional<AdminDteo> getAdminByEmail(String email) {
        return crudAdminRepo.findByEmail(email)
                .map(iAdminMapper::ADMIN_DTEO);
    }

    @Override
    public AdminDteo save(AdminDteo adminDteo) {

        return iAdminMapper.ADMIN_DTEO(crudAdminRepo.save(iAdminMapper.ADMIN_ENTITY(adminDteo)));
    }

    @Override
    public void delete(Integer idadmin) {
        crudAdminRepo.deleteById(idadmin);

    }
}
