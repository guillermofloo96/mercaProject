package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.domain.irepository.IDetProductRepository;
import com.example.mercaweb.persistance.Crud.ICrudDetProductJpa;
import com.example.mercaweb.persistance.Crud.ICrudPresupuestojpa;
import com.example.mercaweb.persistance.Mapper.IDetProdutMapper;
import com.example.mercaweb.persistance.Mapper.IPresuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class DetProductRepository implements IDetProductRepository {


    private final ICrudDetProductJpa iCrudDetProductJpa;
    private final IDetProdutMapper iDetProdutMapper;
    @Override
    public List<DetProductoDto> getAll() {
        return iDetProdutMapper.DET_PRODUCTO_DTOS(iCrudDetProductJpa.findAll());
    }

    @Override
    public Optional<DetProductoDto> getDetProductDto(Integer id) {
        return   iCrudDetProductJpa.findById(id).map(iDetProdutMapper::DET_PRODUCTO_DTO);

    }

    @Override
    public List<DetProductoDto> getAllByTiendakeyIs(Integer id) {
        return iDetProdutMapper.DET_PRODUCTO_DTOS(iCrudDetProductJpa.findAllByTiendakeyIs(id));
    }

    @Override
    public DetProductoDto save(DetProductoDto detProductoDto) {
        return iDetProdutMapper.DET_PRODUCTO_DTO(iCrudDetProductJpa.save(iDetProdutMapper.DET_PRODCUTO_ENTITY(detProductoDto)));
    }

    @Override
    public void delete(Integer id) {
        iCrudDetProductJpa.deleteById(id);

    }
}
