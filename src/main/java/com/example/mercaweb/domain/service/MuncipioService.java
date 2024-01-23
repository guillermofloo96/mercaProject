package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.repository.IMunicipioRepository;
import com.example.mercaweb.domain.useCase.IMunicipioCaseUseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service


public class MuncipioService implements IMunicipioCaseUseService {
    private  final IMunicipioRepository iMunicipioRepository;
    @Override
    public List<MunicipioDto> getAll() {
        return iMunicipioRepository.getAll();
    }

    @Override
    public Optional<MunicipioDto> getMunicipioDto(Integer id) {
        return iMunicipioRepository.getMunicipioDto(id);
    }

    @Override
    public MunicipioDto save(MunicipioDto municipioDto) {
        return iMunicipioRepository.save(municipioDto);

    }

    @Override
    public List<MunicipioDto> getByDepto(Integer id) {

        return  iMunicipioRepository.getMunicipioEntityById(id);
    }

    @Override
    public Optional<MunicipioDto> update(MunicipioDto municipioDto) {
        if(iMunicipioRepository.getMunicipioDto(municipioDto.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iMunicipioRepository.save(municipioDto));
    }

    @Override
    public boolean delete(Integer id) {

        if(iMunicipioRepository.getMunicipioDto(id).isEmpty()){
            return false;
        }
        iMunicipioRepository.delete(id);
        return true;
    }

}
