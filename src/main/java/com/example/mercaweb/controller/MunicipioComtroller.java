package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.domain.dto.MunicipioDto;
import com.example.mercaweb.domain.useCase.IMunicipioCaseUseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/municipio")
public class MunicipioComtroller {

    private final IMunicipioCaseUseService iMunicipioCaseUseService;


    @GetMapping
    public ResponseEntity<List<MunicipioDto>> getAll(){

        return ResponseEntity.ok(iMunicipioCaseUseService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<MunicipioDto>  getAdmin(@PathVariable Integer id) {
        return ResponseEntity.of(iMunicipioCaseUseService.getMunicipioDto(id));
    }

    @GetMapping(path = "/deptos/{id}")
    public ResponseEntity<List<MunicipioDto>>  getByDepto(@PathVariable Integer id) {
        return ResponseEntity.ok(iMunicipioCaseUseService.getByDepto(id));
    }
    @PostMapping
    public ResponseEntity<MunicipioDto> save(@RequestBody  MunicipioDto municipioDto){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iMunicipioCaseUseService.save(municipioDto));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<MunicipioDto> update(@RequestBody  MunicipioDto municipioDto){
        return ResponseEntity.of(iMunicipioCaseUseService.update(municipioDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iMunicipioCaseUseService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }




}

