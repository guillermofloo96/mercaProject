package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.DetPresupuestoDto;
import com.example.mercaweb.domain.irepository.IDetPresupRepository;
import com.example.mercaweb.persistance.Crud.ICrudDetPresupJpa;
import com.example.mercaweb.persistance.Mapper.IDetPresupMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DetPresupRepository implements IDetPresupRepository {

    private final IDetPresupMapper iDetPresupMapper;
    private final ICrudDetPresupJpa iCrudDetPresupJpa;

    @Override
    public List<DetPresupuestoDto> getAll() {
        return iDetPresupMapper.DET_PRESUPUESTO_DTOS(iCrudDetPresupJpa.findAll());
    }

    @Override
    public Optional<DetPresupuestoDto> geDetPresupuestoDto(Integer id) {
        return iCrudDetPresupJpa.findById(id).map(iDetPresupMapper::DET_PRESUPUESTO_DTO);
    }

    @Override
    public List<DetPresupuestoDto> findAllByPresupKeyIs(Integer id) {
        return iDetPresupMapper.DET_PRESUPUESTO_DTOS(iCrudDetPresupJpa.findAllByPresupKeyIs(id));
    }

    @Override
    public DetPresupuestoDto save(DetPresupuestoDto detPresupuestoDto) {
        return iDetPresupMapper.DET_PRESUPUESTO_DTO(iCrudDetPresupJpa.save(iDetPresupMapper.DET_PRESUP_ENTITY(detPresupuestoDto)));

    }

    @Override
    public void delete(Integer id) {
        iCrudDetPresupJpa.deleteById(id);
    }
}
