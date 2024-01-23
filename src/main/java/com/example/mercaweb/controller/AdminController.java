package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.ResponseAdminDto;
import com.example.mercaweb.domain.useCase.IAdminCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/admin")

public class AdminController {

    private final IAdminCase iAdminCase;


    @GetMapping
    public ResponseEntity<List<AdminDteo>> getAll(){
        return ResponseEntity.ok(iAdminCase.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AdminDteo>  getAdmin(@PathVariable Integer id) {
        return ResponseEntity.of(iAdminCase.getAdmin(id));
    }
    @GetMapping(path = "email/{email}")
    public ResponseEntity<AdminDteo>  getAdminByEmail(@PathVariable String email) {
        return ResponseEntity.of(iAdminCase.getAdminByEmail(email));
    }
    @PostMapping
    public ResponseEntity<ResponseAdminDto> save(@RequestBody  AdminDteo adminDteonew){

            return ResponseEntity.status(HttpStatus.CREATED).body(iAdminCase.save(adminDteonew));

    }
    @PatchMapping
    public ResponseEntity<AdminDteo> update(@RequestBody  AdminDteo adminDteoUpdate){
        return ResponseEntity.of(iAdminCase.update(adminDteoUpdate));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iAdminCase.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }
}
