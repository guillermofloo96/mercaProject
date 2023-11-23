package com.example.mercaweb.controller;

import com.example.mercaweb.domain.Pojo.service.IProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path ="/productos")
public class ProductoController {

    private final IProductoService iProductoService;






}
