package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.domain.dto.MercadoDteo;

import java.util.List;
import java.util.Optional;

public interface ICaseUseDetProductService {
    List<DetProductoDto> getAll();

    Optional<DetProductoDto> getDetProductDto(Integer id);

    List<DetProductoDto> getAllByTiendakeyIs(Integer id);
    DetProductoDto save(DetProductoDto detProductoDto);
    Optional<DetProductoDto> update(DetProductoDto detProductoDto);

    boolean delete(Integer id);
}
