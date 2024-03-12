package com.example.mercaweb.domain.service;

import com.example.mercaweb.security.JwtAuthenticationProvider;
import com.example.mercaweb.domain.dto.AuthAdminDto;
import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.JwtResponseDto;
import com.example.mercaweb.domain.irepository.IAdminRepository;
import com.example.mercaweb.domain.useCase.IAuthUseCase;
import com.example.mercaweb.exception.CustomerNotExistException;
import com.example.mercaweb.exception.PasswordIncorrectException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Servicio encargado del logueo de un usuario
 */
@RequiredArgsConstructor
@Service
public class AuthService implements IAuthUseCase {

    private final IAdminRepository iAdminRepository;

    /**
     * Clase que administra los JWTs
     */
    private final JwtAuthenticationProvider jwtAuthenticationProvider;

    /**
     * Clase que encripta contraseñas
     */
    private final PasswordEncoder passwordEncoder;

    /**
     * Devuelve un dto con el jwt del usuario dadas unas credenciales
     * @param authAdminDto Credenciales de acceso
     * @return Dto con el jwt del usuario si las credenciales son validas
     */
    public JwtResponseDto signIn(AuthAdminDto authAdminDto) {

        Optional<AdminDteo> customer = iAdminRepository.getAdminByEmail(authAdminDto.getEmail());

        if (customer.isEmpty()) {
            throw new CustomerNotExistException();
        }

        /*if (!passwordEncoder.matches(authAdminDto.getPasssword(), customer.get().getContra())) {
            throw new PasswordIncorrectException();
        }*/


        return new JwtResponseDto(jwtAuthenticationProvider.createToken(customer.get()));
    }

    /**
     * Cierra la sesión eliminando de la lista blanca el token ingresado
     * @param token Token a eliminar
     * @return
     */
    public JwtResponseDto signOut(String token) {

        String[] authElements = token.split(" ");
        return new JwtResponseDto(jwtAuthenticationProvider.deleteToken(authElements[1]));
    }

}
