package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.domain.irepository.IDetProductRepository;
import com.example.mercaweb.domain.irepository.ITiendaRepository;
import com.example.mercaweb.domain.useCase.ICaseUseDetProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class DetProductService implements ICaseUseDetProductService {
    private  final IDetProductRepository iDetProductRepository;
    @Override
    public List<DetProductoDto> getAll() {
        return iDetProductRepository.getAll();
    }

    @Override
    public Optional<DetProductoDto> getDetProductDto(Integer id) {
        return  iDetProductRepository.getDetProductDto(id);
    }

    @Override
    public List<DetProductoDto> getAllByTiendakeyIs(Integer id) {
        return iDetProductRepository.getAllByTiendakeyIs(id);
    }

    @Override
    public DetProductoDto save(DetProductoDto detProductoDto) {
        return  iDetProductRepository.save(detProductoDto);
    }

    @Override
    public Optional<DetProductoDto> update(DetProductoDto detProductoDto) {
        if(iDetProductRepository.getDetProductDto(detProductoDto.getKey()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iDetProductRepository.save(detProductoDto));    }

    @Override
    public boolean delete(Integer id) {
        if(iDetProductRepository.getDetProductDto(id).isEmpty()){
            return false;
        }
        iDetProductRepository.delete(id);
        return true;
    }
}
