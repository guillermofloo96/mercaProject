package com.example.mercaweb.controller;
import com.example.mercaweb.domain.dto.PresupuestoDto;
import com.example.mercaweb.domain.useCase.ICaseUsePresupuestoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/presu")
public class PresupuestoController {
    private final ICaseUsePresupuestoService iCaseUsePresupuestoService;


    @GetMapping
    public ResponseEntity<List<PresupuestoDto>> getAll(){

        return ResponseEntity.ok(iCaseUsePresupuestoService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PresupuestoDto>  getPresupuestoDto(@PathVariable Integer id) {
        return ResponseEntity.of(iCaseUsePresupuestoService.getPresupuestoDto(id));
    }

    @GetMapping(path = "/usuarios/{id}")
    public ResponseEntity<List<PresupuestoDto>>  getAllByUsuarioKeyIs(@PathVariable Integer id) {
        return ResponseEntity.ok(iCaseUsePresupuestoService.getAllByUsuarioKeyIs(id));
    }
    @GetMapping(path = "/byfecha/{fecha}")
    public ResponseEntity<List<PresupuestoDto>>  getAllByFechaIs(@PathVariable String fecha) {
        return ResponseEntity.ok(iCaseUsePresupuestoService.getAllByFechaIs(fecha));
    }
    @PostMapping
    public ResponseEntity<PresupuestoDto> save(@RequestBody  PresupuestoDto presupuestoDto){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCaseUsePresupuestoService.save(presupuestoDto));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<PresupuestoDto> update(@RequestBody  PresupuestoDto presupuestoDto){
        return ResponseEntity.of(iCaseUsePresupuestoService.update(presupuestoDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iCaseUsePresupuestoService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }

}
