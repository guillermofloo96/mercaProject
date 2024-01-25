package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.domain.irepository.IMercadoRepository;
import com.example.mercaweb.persistance.Crud.ICrudMercadoJpa;
import com.example.mercaweb.persistance.Mapper.IMercadoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class MercadoRepository implements IMercadoRepository {
    private final ICrudMercadoJpa iCrudMercadoJpa;

    private final IMercadoMapper iMercadoMapper;
    @Override
    public List<MercadoDteo> getAll() {

        return iMercadoMapper.MERCADO_DTO_LIST(iCrudMercadoJpa.findAll());
    }

    @Override
    public Optional<MercadoDteo> getMercadoDto(Integer id) {
        return iCrudMercadoJpa.findById(id).map(iMercadoMapper::MERCADO_DTEO);
    }

    @Override
    public List<MercadoDteo> getMercadosEntityByMunicipio(Integer id) {
        return iMercadoMapper.MERCADO_DTO_LIST(iCrudMercadoJpa.findAllByMunicipioKeyIs(id));
    }


    @Override
    public MercadoDteo save(MercadoDteo mercadoDteo) {
        return iMercadoMapper.MERCADO_DTEO(iCrudMercadoJpa.save(iMercadoMapper.MERCADO_ENTITY(mercadoDteo)));
    }

    @Override
    public void delete(Integer id) {
        iCrudMercadoJpa.deleteById(id);

    }
}
