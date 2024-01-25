package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.MercadoEntity;
import com.example.mercaweb.persistance.Entity.TiendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudTiendaJpa extends JpaRepository<TiendaEntity, Integer> {

    List<TiendaEntity> findAllByMercadokeyIs(Integer id);
}
