package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.DetPresupuestoDto;
import com.example.mercaweb.domain.irepository.IDetPresupRepository;
import com.example.mercaweb.domain.useCase.ICaseUseDetPresupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class DetPresupService implements ICaseUseDetPresupService {
    private final IDetPresupRepository iDetPresupRepository;
    @Override
    public List<DetPresupuestoDto> getAll() {
        return iDetPresupRepository.getAll();
    }

    @Override
    public Optional<DetPresupuestoDto> geDetPresupuestoDto(Integer id) {
        return iDetPresupRepository.geDetPresupuestoDto(id);
    }

    @Override
    public List<DetPresupuestoDto> findAllByPresupKeyIs(Integer id) {
        return iDetPresupRepository.findAllByPresupKeyIs(id);
    }

    @Override
    public DetPresupuestoDto save(DetPresupuestoDto detPresupuestoDto) {
        return iDetPresupRepository.save(detPresupuestoDto);
    }

    @Override
    public Optional<DetPresupuestoDto> update(DetPresupuestoDto detPresupuestoDto) {
        if(iDetPresupRepository.geDetPresupuestoDto(detPresupuestoDto.getPresupKey()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iDetPresupRepository.save(detPresupuestoDto));
    }

    @Override
    public boolean delete(Integer id) {
        if(iDetPresupRepository.geDetPresupuestoDto(id).isEmpty()){
            return false;
        }
        iDetPresupRepository.delete(id);
        return true;

    }
}
