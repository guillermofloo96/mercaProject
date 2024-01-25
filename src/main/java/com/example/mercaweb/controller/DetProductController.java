package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.DetProductoDto;
import com.example.mercaweb.domain.useCase.ICaseUseDetProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/detproduct")
public class DetProductController {
    private final ICaseUseDetProductService iCaseUseDetProductService;


    @GetMapping
    public ResponseEntity<List<DetProductoDto>> getAll(){

        return ResponseEntity.ok(iCaseUseDetProductService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<DetProductoDto>  getPresupuestoDto(@PathVariable Integer id) {
        return ResponseEntity.of(iCaseUseDetProductService.getDetProductDto(id));
    }

    @GetMapping(path = "/tiendas/{id}")
    public ResponseEntity<List<DetProductoDto>>  getAllByTiendakeyIs(@PathVariable Integer id) {
        return ResponseEntity.ok(iCaseUseDetProductService.getAllByTiendakeyIs(id));
    }

    @PostMapping
    public ResponseEntity<DetProductoDto> save(@RequestBody  DetProductoDto detProductoDto){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCaseUseDetProductService.save(detProductoDto));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<DetProductoDto> update(@RequestBody  DetProductoDto detProductoDto){
        return ResponseEntity.of(iCaseUseDetProductService.update(detProductoDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iCaseUseDetProductService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }
}
