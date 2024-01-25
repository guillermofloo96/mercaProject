package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.domain.irepository.IMercadoRepository;
import com.example.mercaweb.domain.useCase.ICaseUseMercadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service

public class MercadoService implements ICaseUseMercadoService {
    private  final IMercadoRepository iMercadoRepository;
    @Override
    public List<MercadoDteo> getAll() {

        return iMercadoRepository.getAll();
    }

    @Override
    public Optional<MercadoDteo> getMercadoDto(Integer id) {

        return iMercadoRepository.getMercadoDto(id);
    }

    @Override
    public List<MercadoDteo> getAllByMunicipioKeyIs(Integer id) {
        return  iMercadoRepository.getMercadosEntityByMunicipio(id);
    }

    @Override
    public MercadoDteo save(MercadoDteo mercadoDteo) {
        return iMercadoRepository.save(mercadoDteo);
    }

    @Override
    public Optional<MercadoDteo> update(MercadoDteo mercadoDteo) {
        if(iMercadoRepository.getMercadoDto(mercadoDteo.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iMercadoRepository.save(mercadoDteo));
    }

    @Override
    public boolean delete(Integer id) {

        if(iMercadoRepository.getMercadoDto(id).isEmpty()){
            return false;
        }
        iMercadoRepository.delete(id);
        return true;
    }


}
