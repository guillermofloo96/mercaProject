package com.example.mercaweb.persistance.Crud;
import com.example.mercaweb.persistance.Entity.DetPresupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudDetPresupJpa extends JpaRepository<DetPresupEntity, Integer> {

    List<DetPresupEntity> findAllByPresupKeyIs(Integer id);
}
