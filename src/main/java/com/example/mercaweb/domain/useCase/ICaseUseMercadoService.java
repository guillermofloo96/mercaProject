package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.domain.dto.MunicipioDto;

import java.util.List;
import java.util.Optional;

public interface ICaseUseMercadoService {

    List<MercadoDteo> getAll();

    Optional<MercadoDteo> getMercadoDto(Integer id);

    List<MercadoDteo> getAllByMunicipioKeyIs(Integer id);
    MercadoDteo save(MercadoDteo mercadoDteo);
    Optional<MercadoDteo> update(MercadoDteo mercadoDteo);


    boolean delete(Integer id);
}
