package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.PresupuestoDto;
import com.example.mercaweb.domain.irepository.IPresupuestoRepository;
import com.example.mercaweb.domain.useCase.ICaseUsePresupuestoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class PresupuestoService implements ICaseUsePresupuestoService {

    private final IPresupuestoRepository iPresupuestoRepository;
    @Override
    public List<PresupuestoDto> getAll() {
        return iPresupuestoRepository.getAll();
    }

    @Override
    public Optional<PresupuestoDto> getPresupuestoDto(Integer id) {
        return iPresupuestoRepository.getPresupuestoDto(id);
    }

    @Override
    public List<PresupuestoDto> getAllByUsuarioKeyIs(Integer id) {
        return  iPresupuestoRepository.getAllByUsuarioKeyIs(id);
    }

    @Override
    public List<PresupuestoDto> getAllByFechaIs(String fecha) {
        return  iPresupuestoRepository.getAllByFechaIs(fecha);
    }

    @Override
    public PresupuestoDto save(PresupuestoDto presupuestoDto) {
        return iPresupuestoRepository.save(presupuestoDto);
    }

    @Override
    public Optional<PresupuestoDto> update(PresupuestoDto presupuestoDto) {
        if(iPresupuestoRepository.getPresupuestoDto(presupuestoDto.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iPresupuestoRepository.save(presupuestoDto));
    }

    @Override
    public boolean delete(Integer id) {
        if(iPresupuestoRepository.getPresupuestoDto(id).isEmpty()){
            return false;
        }iPresupuestoRepository.delete(id);
        return true;

    }
}
