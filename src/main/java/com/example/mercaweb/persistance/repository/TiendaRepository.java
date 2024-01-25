package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.TiendaDteo;
import com.example.mercaweb.domain.irepository.ITiendaRepository;
import com.example.mercaweb.persistance.Crud.ICrudTiendaJpa;
import com.example.mercaweb.persistance.Mapper.ITiendaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class TiendaRepository implements ITiendaRepository {

    private final ICrudTiendaJpa iCrudTiendaJpa;
    private final ITiendaMapper iTiendaMapper;


    @Override
    public List<TiendaDteo> getAll() {

        return iTiendaMapper.TIENDA_DTO_LIST(iCrudTiendaJpa.findAll());
    }

    @Override
    public Optional<TiendaDteo> getTiendaDteo(Integer id) {
        return iCrudTiendaJpa.findById(id).map(iTiendaMapper::TIENDA_DTEO);
    }

    @Override
    public List<TiendaDteo> getAllByMercadokeyIs(Integer id) {
        return iTiendaMapper.TIENDA_DTO_LIST(iCrudTiendaJpa.findAllByMercadokeyIs(id));

    }

    @Override
    public TiendaDteo save(TiendaDteo tiendaDteo) {
        return iTiendaMapper.TIENDA_DTEO(iCrudTiendaJpa.save(iTiendaMapper.TIENDA_ENTITY(tiendaDteo)));

    }

    @Override
    public void delete(Integer id) {
        iCrudTiendaJpa.deleteById(id);

    }
}
