package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.domain.irepository.IDeptoRepository;
import com.example.mercaweb.domain.useCase.ICaseUseDeptoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class DeptoService implements ICaseUseDeptoService {

    private  final IDeptoRepository iDeptoRepository;
    @Override
    public List<DeptoDto> getAll() {
        return iDeptoRepository.getAll();
    }

    @Override
    public Optional<DeptoDto> getDepto(Integer id) {
        return iDeptoRepository.getDepto(id);
    }

    @Override
    public DeptoDto save(DeptoDto deptoDto) {

      return  iDeptoRepository.save(deptoDto);
    }

    @Override
    public Optional<DeptoDto> update(DeptoDto deptoDto) {
        if(iDeptoRepository.getDepto(deptoDto.getKeydepto()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iDeptoRepository.save(deptoDto));
    }




    @Override
    public boolean delete(Integer id) {
        if(iDeptoRepository.getDepto(id).isEmpty()){
            return false;
        }
        iDeptoRepository.delete(id);
        return true;
    }
}
