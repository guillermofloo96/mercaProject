package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.TiendaDteo;

import java.util.List;
import java.util.Optional;

public interface ITiendaRepository {

    List<TiendaDteo> getAll();

    Optional<TiendaDteo> getTiendaDteo(Integer id);

    List<TiendaDteo> getAllByMercadokeyIs(Integer id);
    TiendaDteo save(TiendaDteo tiendaDteo);


    void delete(Integer id);
}
