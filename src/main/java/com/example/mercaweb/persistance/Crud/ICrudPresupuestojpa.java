package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.PresupuestoEntity;
import com.example.mercaweb.persistance.Entity.TiendaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudPresupuestojpa extends JpaRepository<PresupuestoEntity, Integer> {

    List<PresupuestoEntity> findAllByUsuariokeyIs(Integer id);
    List<PresupuestoEntity> findAllByFechaIs(String fecha);

}
