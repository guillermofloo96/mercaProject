package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.TiendaDteo;
import com.example.mercaweb.domain.irepository.ITiendaRepository;
import com.example.mercaweb.domain.useCase.ICaseUseTiendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class TiendaService implements ICaseUseTiendaService {

    private  final ITiendaRepository iTiendaRepository;
    @Override
    public List<TiendaDteo> getAll() {

        return   iTiendaRepository.getAll();
    }

    @Override
    public Optional<TiendaDteo> getTiendaDteo(Integer id) {
        return  iTiendaRepository.getTiendaDteo(id);
    }

    @Override
    public List<TiendaDteo> getAllByMercadokeyIs(Integer id) {

        return iTiendaRepository.getAllByMercadokeyIs(id);
    }

    @Override
    public TiendaDteo save(TiendaDteo tiendaDteo) {
        return  iTiendaRepository.save(tiendaDteo);
    }

    @Override
    public Optional<TiendaDteo> update(TiendaDteo tiendaDteo) {
        if(iTiendaRepository.getTiendaDteo(tiendaDteo.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iTiendaRepository.save(tiendaDteo));
    }

    @Override
    public boolean delete(Integer id) {
        if(iTiendaRepository.getTiendaDteo(id).isEmpty()){
            return false;
        }
        iTiendaRepository.delete(id);
        return true;

    }
}
