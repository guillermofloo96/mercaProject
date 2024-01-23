package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.AdminEntity;
import com.example.mercaweb.persistance.Entity.DeptoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudDeptoRepo extends JpaRepository<DeptoEntity, Integer> {
}
