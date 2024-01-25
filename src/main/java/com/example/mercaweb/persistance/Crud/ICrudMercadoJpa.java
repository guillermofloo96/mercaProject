package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.MercadoEntity;
import com.example.mercaweb.persistance.Entity.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudMercadoJpa extends JpaRepository<MercadoEntity, Integer> {

    List<MercadoEntity> findAllByMunicipioKeyIs(Integer id);

}
