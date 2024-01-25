package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.PresupuestoDto;
import com.example.mercaweb.domain.irepository.IPresupuestoRepository;
import com.example.mercaweb.persistance.Crud.ICrudPresupuestojpa;
import com.example.mercaweb.persistance.Crud.ICrudTiendaJpa;
import com.example.mercaweb.persistance.Entity.PresupuestoEntity;
import com.example.mercaweb.persistance.Mapper.IPresuMapper;
import com.example.mercaweb.persistance.Mapper.ITiendaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class PresupuestoRepository implements IPresupuestoRepository {


    private final ICrudPresupuestojpa iCrudPresupuestojpa;
    private final IPresuMapper iPresuMapper;
    @Override
    public List<PresupuestoDto> getAll() {
        return iPresuMapper.PRESUPUESTO_DTO_LIST(iCrudPresupuestojpa.findAll());
    }

    @Override
    public Optional<PresupuestoDto> getPresupuestoDto(Integer id) {
        return   iCrudPresupuestojpa.findById(id).map(iPresuMapper::PRESUPUESTO_DTO);
    }

    @Override
    public List<PresupuestoDto> getAllByUsuarioKeyIs(Integer id) {
        return iPresuMapper.PRESUPUESTO_DTO_LIST(iCrudPresupuestojpa.findAllByUsuariokeyIs(id));
    }

    @Override
    public List<PresupuestoDto> getAllByFechaIs(String fecha) {
        return iPresuMapper.PRESUPUESTO_DTO_LIST(iCrudPresupuestojpa.findAllByFechaIs(fecha));
    }

    @Override
    public PresupuestoDto save(PresupuestoDto presupuestoDto) {
        return iPresuMapper.PRESUPUESTO_DTO(iCrudPresupuestojpa.save(iPresuMapper.PRESUPUESTO_ENTITY(presupuestoDto)));
    }

    @Override
    public void delete(Integer id) {
        iCrudPresupuestojpa.deleteById(id);
    }
}
