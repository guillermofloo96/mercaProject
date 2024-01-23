package com.example.mercaweb.domain.service;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.ResponseAdminDto;
import com.example.mercaweb.domain.repository.IAdminRepository;
import com.example.mercaweb.domain.useCase.IAdminCase;
import com.example.mercaweb.exeption.EmailValidationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;


/**
 * servicio de administradores
 */
@RequiredArgsConstructor
@Service
public class AdminService implements IAdminCase {

    private  final IAdminRepository iAdminRepository;

    @Override
    public List<AdminDteo> getAll() {

        return iAdminRepository.getAll();
    }

    @Override
    public Optional<AdminDteo> getAdmin(Integer id) {
        return iAdminRepository.getAdmin(id);

    }

    @Override
    public Optional<AdminDteo> getAdminByEmail(String email) {

        return iAdminRepository.getAdminByEmail(email);
    }



    @Override
    public ResponseAdminDto save(AdminDteo adminDteo) {

        if (!adminDteo.getEmail().matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" +
                "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")){
            throw new EmailValidationException();
        }
        String paswordGenerated= generateRandomPasword(9);
        adminDteo.setContra(paswordGenerated);
        iAdminRepository.save(adminDteo);

        return  new ResponseAdminDto(paswordGenerated);
    }

    @Override
    public Optional<AdminDteo> update(AdminDteo adminDto) {
        if(iAdminRepository.getAdmin(adminDto.getId()).isEmpty()){
            return Optional.empty();
        }
        return Optional.of(iAdminRepository.save(adminDto));
    }


    @Override
    public boolean delete(Integer idadmin) {
        if(iAdminRepository.getAdmin(idadmin).isEmpty()){
            return false;
        }
        iAdminRepository.delete(idadmin);
        return true;

    }
/*
mtodo para generar una contraseña alfanumerica de una longitud especifica
 */
    private String generateRandomPasword(int len){
        // ranago ASCII -ALFANANUMERICA (0-9,a-z, A-Z)
        final String chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
        SecureRandom random= new SecureRandom();
        StringBuilder sb= new StringBuilder();
        /**
         * Cada interaccion de bucle elige aleatoriamente un caracter del dado rango
         * ascii y la agrega a la instancia 'StringBuilder'
         */

        for (int i=0; i<len; i++){
            int randimIndex =random.nextInt(chars.length());
            sb.append(chars.charAt(randimIndex));
        }
        return sb.toString();
    }
}
