package com.example.mercaweb.domain.irepository;

import com.example.mercaweb.domain.dto.MercadoDteo;

import java.util.List;
import java.util.Optional;

public interface IMercadoRepository {

    List<MercadoDteo> getAll();

    Optional<MercadoDteo> getMercadoDto(Integer id);

    List<MercadoDteo> getMercadosEntityByMunicipio(Integer id);
    MercadoDteo save(MercadoDteo mercadoDteo);


    void delete(Integer id);
}
