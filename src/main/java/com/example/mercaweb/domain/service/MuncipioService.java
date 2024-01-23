package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.useCase.IMunicipioCaseUseService;

import java.util.List;
import java.util.Optional;

public class MuncipioService implements IMunicipioCaseUseService {
    @Override
    public List<MunicipioDto> getAll() {
        return null;
    }

    @Override
    public Optional<MunicipioDto> getMunicipioDto(Integer id) {
        return Optional.empty();
    }

    @Override
    public MunicipioDto save(MunicipioDto municipioDto) {
        return null;
    }

    @Override
    public Optional<MunicipioDto> update(MunicipioDto municipioDto) {
        return Optional.empty();
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
