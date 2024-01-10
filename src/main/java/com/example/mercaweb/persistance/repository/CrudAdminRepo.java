package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.persistance.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CrudAdminRepo extends JpaRepository<AdminEntity, Integer> {


    Optional<AdminEntity> findByEmail(String email);

}
