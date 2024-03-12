package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.DetPresupuestoDto;
import com.example.mercaweb.domain.useCase.ICaseUseDetPresupService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/detpresu")
public class DetPresupuestoController {
    private final ICaseUseDetPresupService iCaseUseDetPresupService;


    @GetMapping
    public ResponseEntity<List<DetPresupuestoDto>> getAll(){

        return ResponseEntity.ok(iCaseUseDetPresupService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<DetPresupuestoDto>  getPresupuestoDto(@PathVariable Integer id) {
        return ResponseEntity.of(iCaseUseDetPresupService.geDetPresupuestoDto(id));
    }

    @GetMapping(path = "/tiendas/{id}")
    public ResponseEntity<List<DetPresupuestoDto>>  getAllByTiendakeyIs(@PathVariable Integer id) {
        return ResponseEntity.ok(iCaseUseDetPresupService.findAllByPresupKeyIs(id));
    }

    @PostMapping
    public ResponseEntity<DetPresupuestoDto> save(@RequestBody  DetPresupuestoDto detPresupuestoDto){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCaseUseDetPresupService.save(detPresupuestoDto));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<DetPresupuestoDto> update(@RequestBody  DetPresupuestoDto detPresupuestoDto){
        return ResponseEntity.of(iCaseUseDetPresupService.update(detPresupuestoDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iCaseUseDetPresupService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }
}
