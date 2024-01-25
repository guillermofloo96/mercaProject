package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.domain.dto.TiendaDteo;

import java.util.List;
import java.util.Optional;

public interface ICaseUseTiendaService {

    List<TiendaDteo> getAll();

    Optional<TiendaDteo> getTiendaDteo(Integer id);

    List<TiendaDteo> getAllByMercadokeyIs(Integer id);
    TiendaDteo save(TiendaDteo tiendaDteo);
    Optional<TiendaDteo> update(TiendaDteo tiendaDteo);


    boolean delete(Integer id);
}
