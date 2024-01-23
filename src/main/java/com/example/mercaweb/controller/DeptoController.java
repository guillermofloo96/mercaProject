package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.DeptoDto;
import com.example.mercaweb.domain.useCase.ICaseUseDeptoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/depto")
public class DeptoController {
    private final ICaseUseDeptoService iCaseUseDeptoService;

    @GetMapping
    public ResponseEntity<List<DeptoDto>> getAll(){

        return ResponseEntity.ok(iCaseUseDeptoService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<DeptoDto>  getAdmin(@PathVariable Integer id) {
        return ResponseEntity.of(iCaseUseDeptoService.getDepto(id));
    }
    @PostMapping
    public ResponseEntity<DeptoDto> save(@RequestBody  DeptoDto deptoDto){



        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iCaseUseDeptoService.save(deptoDto));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
    @PatchMapping
    public ResponseEntity<DeptoDto> update(@RequestBody  DeptoDto deptoDto){
        return ResponseEntity.of(iCaseUseDeptoService.update(deptoDto));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iCaseUseDeptoService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }


}
