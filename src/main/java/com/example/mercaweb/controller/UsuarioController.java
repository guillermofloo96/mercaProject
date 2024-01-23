package com.example.mercaweb.controller;


import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.dto.UsuarioDto;
import com.example.mercaweb.domain.useCase.IMunicipioCaseUseService;
import com.example.mercaweb.domain.useCase.IUsuarioCaseUseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/usuario")
public class UsuarioController {
    private final IUsuarioCaseUseService iUsuarioCaseUseService;

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getAll(){

        return ResponseEntity.ok(iUsuarioCaseUseService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UsuarioDto>  getAdmin(@PathVariable Integer id) {
        return ResponseEntity.of(iUsuarioCaseUseService.getUsuarioById(id));
    }


    @PostMapping
    public ResponseEntity<UsuarioDto> save(@RequestBody  UsuarioDto municipioDto){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iUsuarioCaseUseService.save(municipioDto));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<UsuarioDto> update(@RequestBody  UsuarioDto municipioDto){
        return ResponseEntity.of(iUsuarioCaseUseService.update(municipioDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iUsuarioCaseUseService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }
}
