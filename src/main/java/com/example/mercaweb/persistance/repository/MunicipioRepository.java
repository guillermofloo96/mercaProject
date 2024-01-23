package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.repository.IMunicipioRepository;

import com.example.mercaweb.persistance.Crud.ICrudMunicipio;

import com.example.mercaweb.persistance.Mapper.IMunicipioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class MunicipioRepository implements IMunicipioRepository {


    private final ICrudMunicipio iCrudMunicipio;

    private final IMunicipioMapper iMunicipioMapper;

    @Override
    public List<MunicipioDto> getAll() {
        return iMunicipioMapper.MUNICIPIO_DTO_LIST(iCrudMunicipio.findAll());
    }

    @Override
    public Optional<MunicipioDto> getMunicipioDto(Integer id) {
        return iCrudMunicipio.findById(id).map(iMunicipioMapper::MUNICIPIO_DTO);
    }

    @Override
    public List<MunicipioDto> getMunicipioEntityById(Integer id) {
        return iMunicipioMapper.MUNICIPIO_DTO_LIST(iCrudMunicipio.findAllByDeptokeyIs(id));
    }

    @Override
    public MunicipioDto save(MunicipioDto municipioDto) {

        return iMunicipioMapper.MUNICIPIO_DTO(iCrudMunicipio.save(iMunicipioMapper.MUNICIPIO_ENTITY(municipioDto)));

    }

    @Override
    public void delete(Integer id) {
        iCrudMunicipio.deleteById(id);

    }
}
