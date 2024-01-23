package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.UsuarioDto;
import com.example.mercaweb.domain.repository.IMunicipioRepository;
import com.example.mercaweb.domain.repository.IUsuarioRepository;
import com.example.mercaweb.domain.useCase.IUsuarioCaseUseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioCaseUseService {
    private final IUsuarioRepository iUsuarioRepository;

    @Override
    public List<UsuarioDto> getAll() {
        return iUsuarioRepository.getAll();
    }

    @Override
    public Optional<UsuarioDto> getUsuarioById(Integer id) {
        return iUsuarioRepository.getUsuarioById(id);
    }

    @Override
    public UsuarioDto save(UsuarioDto usuarioDto) {
        return iUsuarioRepository.save(usuarioDto);
    }

    @Override
    public boolean delete(Integer id) {
        if(iUsuarioRepository.getUsuarioById(id).isEmpty()){
            return false;
        }
        iUsuarioRepository.delete(id);
        return true;
    }

}
