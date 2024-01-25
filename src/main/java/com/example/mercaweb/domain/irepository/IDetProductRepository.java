package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.domain.dto.MercadoDteo;

import java.util.List;
import java.util.Optional;

public interface IDetProductRepository {

    List<DetProductoDto> getAll();

    Optional<DetProductoDto> getDetProductDto(Integer id);

    List<DetProductoDto> getAllByTiendakeyIs(Integer id);
    DetProductoDto save(DetProductoDto detProductoDto);


    void delete(Integer id);
}
