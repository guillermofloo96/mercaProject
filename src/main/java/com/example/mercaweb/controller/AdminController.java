package com.example.mercaweb.controller;

import com.example.mercaweb.domain.dto.AdminDteo;
import com.example.mercaweb.domain.dto.ResponseAdminDto;
import com.example.mercaweb.domain.service.IAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/admin")

public class AdminController {

    private final IAdminService iAdminService;


    @GetMapping
    public ResponseEntity<List<AdminDteo>> getAll(){
        return ResponseEntity.ok(iAdminService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<AdminDteo>  getAdmin(@PathVariable Integer id) {
        return ResponseEntity.of(iAdminService.getAdmin(id));
    }
    @GetMapping(path = "/{email}")
    public ResponseEntity<AdminDteo>  getAdminByEmail(@PathVariable String email) {
        return ResponseEntity.of(iAdminService.getAdminByEmail(email));
    }
    @PostMapping
    public ResponseEntity<ResponseAdminDto> save(@RequestBody  AdminDteo adminDteonew){

        try{
            return ResponseEntity.status(HttpStatus.CREATED).body(iAdminService.save(adminDteonew));

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @PatchMapping
    public ResponseEntity<AdminDteo> update(@RequestBody  AdminDteo adminDteoUpdate){
        return ResponseEntity.of(iAdminService.update(adminDteoUpdate));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(this.iAdminService.delete(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);

    }
}
