package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.PresupuestoDto;
import com.example.mercaweb.persistance.Entity.PresupuestoEntity;

import java.util.List;
import java.util.Optional;

public interface IPresupuestoRepository {

    List<PresupuestoDto> getAll();

    Optional<PresupuestoDto> getPresupuestoDto(Integer id);

    List<PresupuestoDto> getAllByUsuarioKeyIs(Integer id);
    List<PresupuestoDto> getAllByFechaIs(String fecha);
    PresupuestoDto save(PresupuestoDto presupuestoDto);


    void delete(Integer id);
}
