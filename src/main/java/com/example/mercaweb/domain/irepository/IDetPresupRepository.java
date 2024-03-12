package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.DetPresupuestoDto;
import com.example.mercaweb.domain.dto.DetProductoDto;

import java.util.List;
import java.util.Optional;

public interface IDetPresupRepository {
    List<DetPresupuestoDto> getAll();

    Optional<DetPresupuestoDto> geDetPresupuestoDto(Integer id);

    List<DetPresupuestoDto> findAllByPresupKeyIs(Integer id);
    DetPresupuestoDto save(DetPresupuestoDto detPresupuestoDto);


    void delete(Integer id);
}
