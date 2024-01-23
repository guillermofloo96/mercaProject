package com.example.mercaweb.domain.repository;

import com.example.mercaweb.domain.dto.DeptoDto;

import java.util.List;
import java.util.Optional;

public interface IDeptoRepository {
    List<DeptoDto> getAll();

    Optional<DeptoDto> getDepto(Integer id);
    DeptoDto save(DeptoDto deptoDto);


    void delete(Integer id);
}
