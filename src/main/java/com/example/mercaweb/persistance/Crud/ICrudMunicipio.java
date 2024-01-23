package com.example.mercaweb.persistance.Crud;

import com.example.mercaweb.persistance.Entity.DeptoEntity;
import com.example.mercaweb.persistance.Entity.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudMunicipio  extends JpaRepository<MunicipioEntity, Integer> {

    List<MunicipioEntity> findAllByDeptokeyIs(Integer id);
}
