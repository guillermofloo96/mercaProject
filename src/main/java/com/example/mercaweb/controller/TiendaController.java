package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.TiendaDteo;
import com.example.mercaweb.domain.useCase.ICaseUseTiendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/tienda")
public class TiendaController {
    private final ICaseUseTiendaService iCaseUseTiendaService;


    @GetMapping
    public ResponseEntity<List<TiendaDteo>> getAll(){

        return ResponseEntity.ok(iCaseUseTiendaService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<TiendaDteo>  getMercadoDto(@PathVariable Integer id) {
        return ResponseEntity.of(iCaseUseTiendaService.getTiendaDteo(id));
    }

    @GetMapping(path = "/mercados/{id}")
    public ResponseEntity<List<TiendaDteo>>  getMercadosEntityBy(@PathVariable Integer id) {
        return ResponseEntity.ok(iCaseUseTiendaService.getAllByMercadokeyIs(id));
    }
    @PostMapping
    public ResponseEntity<TiendaDteo> save(@RequestBody  TiendaDteo tiendaDteo){


        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCaseUseTiendaService.save(tiendaDteo));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<TiendaDteo> update(@RequestBody  TiendaDteo tiendaDteo){
        return ResponseEntity.of(iCaseUseTiendaService.update(tiendaDteo));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iCaseUseTiendaService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }


}
