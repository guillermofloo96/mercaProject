package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.domain.dto.ProductoDto;

import java.util.List;
import java.util.Optional;

public interface ICaseUseDeptoService {
    List<DeptoDto> getAll();

    Optional<DeptoDto> getDepto(Integer id);
    DeptoDto save(DeptoDto deptoDto);

    Optional<DeptoDto> update(DeptoDto deptoDto);

    boolean delete(Integer id);
}
