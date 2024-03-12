package com.example.mercaweb.controller;


import com.example.mercaweb.domain.dto.AuthAdminDto;
import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.JwtResponseDto;
import com.example.mercaweb.domain.dto.ResponseAdminDto;
import com.example.mercaweb.domain.useCase.IAuthUseCase;
import com.example.mercaweb.domain.useCase.IAdminCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/auth")
public class AuthController {

    private final IAuthUseCase iAuthUseCase;

    private final IAdminCase iAdminCase;


    @PostMapping(path = "/register") 
    public ResponseEntity<ResponseAdminDto> save(@RequestBody AdminDteo customerDtoNew) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(iAdminCase.save(customerDtoNew));
    }

    @PostMapping(path = "/sign-in")
    public ResponseEntity<JwtResponseDto> signIn(@RequestBody AuthAdminDto authCustomerDto) {
        return ResponseEntity.ok(iAuthUseCase.signIn(authCustomerDto));
    }

    @PostMapping(path = "/sign-out")
    public ResponseEntity<JwtResponseDto> signOut(@RequestHeader(name = HttpHeaders.AUTHORIZATION) String jwt) {
        return ResponseEntity.ok(iAuthUseCase.signOut(jwt));
    }
}
