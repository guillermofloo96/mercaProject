package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.domain.dto.MunicipioDto;

import java.util.List;
import java.util.Optional;

public interface IMunicipioCaseUseService {

    List<MunicipioDto> getAll();

    Optional<MunicipioDto> getMunicipioDto(Integer id);
    MunicipioDto save(MunicipioDto municipioDto);

    Optional<MunicipioDto> update(MunicipioDto municipioDto);

    boolean delete(Integer id);
}
