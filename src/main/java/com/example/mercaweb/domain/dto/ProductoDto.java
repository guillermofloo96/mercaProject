package com.example.mercaweb.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductoDto {

    private Integer id;
    private String nombres;
    private String descripcion;
    private Double precio;
    private String foto;

}
