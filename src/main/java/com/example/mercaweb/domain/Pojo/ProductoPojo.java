package com.example.mercaweb.domain.Pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductoPojo {

    private Long id;
    private String name;
    private String descrip;
    private Double precio;
    private String foto;

}