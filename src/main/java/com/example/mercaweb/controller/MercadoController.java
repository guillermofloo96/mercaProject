package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.MercadoDteo;
import com.example.mercaweb.domain.useCase.ICaseUseMercadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/mercado")
public class MercadoController {
    private final ICaseUseMercadoService iCaseUseMercadoService;


    @GetMapping
    public ResponseEntity<List<MercadoDteo>> getAll(){

        return ResponseEntity.ok(iCaseUseMercadoService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<MercadoDteo>  getMercadoDto(@PathVariable Integer id) {
        return ResponseEntity.of(iCaseUseMercadoService.getMercadoDto(id));
    }

    @GetMapping(path = "/mercados/{id}")
    public ResponseEntity<List<MercadoDteo>>  getMercadosEntityBy(@PathVariable Integer id) {
        return ResponseEntity.ok(iCaseUseMercadoService.getAllByMunicipioKeyIs(id));
    }
    @PostMapping
    public ResponseEntity<MercadoDteo> save(@RequestBody  MercadoDteo mercadoDteo){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCaseUseMercadoService.save(mercadoDteo));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<MercadoDteo> update(@RequestBody  MercadoDteo mercadoDteo){
        return ResponseEntity.of(iCaseUseMercadoService.update(mercadoDteo));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iCaseUseMercadoService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }


}
