package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.DetProdcutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudDetProductJpa extends JpaRepository<DetProdcutoEntity, Integer> {

    List<DetProdcutoEntity> findAllByTiendakeyIs(Integer id);


}
