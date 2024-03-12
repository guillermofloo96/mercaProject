package com.example.mercaweb.domain.useCase;

import com.example.mercaweb.domain.dto.AuthAdminDto;
import com.example.mercaweb.domain.dto.JwtResponseDto;

public interface IAuthUseCase {

    JwtResponseDto signIn(AuthAdminDto authCustomerDto);

    JwtResponseDto signOut(String jwt);

}
