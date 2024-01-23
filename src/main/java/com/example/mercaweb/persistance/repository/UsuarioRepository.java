package com.example.mercaweb.persistance.repository;

import com.example.mercaweb.domain.dto.UsuarioDto;
import com.example.mercaweb.domain.repository.IUsuarioRepository;
import com.example.mercaweb.persistance.Crud.ICrudMunicipio;
import com.example.mercaweb.persistance.Crud.ICrudUsuario;
import com.example.mercaweb.persistance.Mapper.IMunicipioMapper;
import com.example.mercaweb.persistance.Mapper.IUsuarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Repository
public class UsuarioRepository implements IUsuarioRepository {
     private final ICrudUsuario iCrudUsuario;

        private final IUsuarioMapper iUsuarioMapper;
    @Override
    public List<UsuarioDto> getAll() {
        return iUsuarioMapper.USUARIO_DTO_LIST(iCrudUsuario.findAll());    }

    @Override
    public Optional<UsuarioDto> getUsuarioById(Integer id) {
        return iCrudUsuario.findById(id).map(iUsuarioMapper::USUARIO_DTO);
    }

    @Override
    public UsuarioDto save(UsuarioDto usuarioDto) {
        return iUsuarioMapper.USUARIO_DTO(iCrudUsuario.save(iUsuarioMapper.USUARIO_ENTITY(usuarioDto)));

    }

    @Override
    public void delete(Integer id) {
        iCrudUsuario.deleteById(id);
    }
}
