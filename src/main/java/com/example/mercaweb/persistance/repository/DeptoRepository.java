package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.domain.repository.IDeptoRepository;
import com.example.mercaweb.persistance.Crud.CrudAdminRepo;
import com.example.mercaweb.persistance.Crud.CrudDeptoRepo;
import com.example.mercaweb.persistance.Mapper.IDeptoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class DeptoRepository implements IDeptoRepository {

    private final CrudDeptoRepo crudDeptoRepo;

    private final IDeptoMapper iDeptoMapper;
    @Override
    public List<DeptoDto> getAll() {
        return iDeptoMapper.deptoList(crudDeptoRepo.findAll());


    }

    @Override
    public Optional<DeptoDto> getDepto(Integer id) {
        return crudDeptoRepo.findById(id)
                .map(iDeptoMapper::DEPTO_DTO);
    }

    @Override
    public DeptoDto save(DeptoDto deptoDto) {
        return iDeptoMapper.DEPTO_DTO(crudDeptoRepo.save(iDeptoMapper.DEPTO_ENTITY(deptoDto)));
    }

    @Override
    public void delete(Integer id) {
        crudDeptoRepo.deleteById(id);
    }
}
