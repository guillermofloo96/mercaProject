package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.DetPresupuestoDto;
import com.example.mercaweb.domain.dto.DetProductoDto;

import java.util.List;
import java.util.Optional;

public interface ICaseUseDetPresupService {
    List<DetPresupuestoDto> getAll();

    Optional<DetPresupuestoDto> geDetPresupuestoDto(Integer id);

    List<DetPresupuestoDto> findAllByPresupKeyIs(Integer id);
    DetPresupuestoDto save(DetPresupuestoDto detPresupuestoDto);
    Optional<DetPresupuestoDto> update(DetPresupuestoDto detPresupuestoDto);



    boolean delete(Integer id);

}
