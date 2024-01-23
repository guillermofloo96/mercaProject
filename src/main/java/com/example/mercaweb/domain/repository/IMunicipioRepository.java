package com.example.mercaweb.domain.repository;


import com.example.mercaweb.domain.dto.MunicipioDto;

import java.util.List;
import java.util.Optional;

public interface IMunicipioRepository {

    List<MunicipioDto> getAll();

    Optional<MunicipioDto> getMunicipioDto(Integer id);

    List<MunicipioDto> getByDepto(Integer id);
    MunicipioDto save(MunicipioDto municipioDto);


    void delete(Integer id);
}
