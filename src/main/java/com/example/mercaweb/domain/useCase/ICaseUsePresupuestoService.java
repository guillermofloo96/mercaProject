package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.dto.PresupuestoDto;

import java.util.List;
import java.util.Optional;

public interface ICaseUsePresupuestoService {

    List<PresupuestoDto> getAll();

    Optional<PresupuestoDto> getPresupuestoDto(Integer id);

    List<PresupuestoDto> getAllByUsuarioKeyIs(Integer id);
    List<PresupuestoDto> getAllByFechaIs(String fecha);
    PresupuestoDto save(PresupuestoDto presupuestoDto);
    Optional<PresupuestoDto> update(PresupuestoDto presupuestoDto);


    boolean delete(Integer id);
}
