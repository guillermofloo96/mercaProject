package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.persistance.Entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudProductRepository extends JpaRepository<ProductoEntity, Integer> {
}
