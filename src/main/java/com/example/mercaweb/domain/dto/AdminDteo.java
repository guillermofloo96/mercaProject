package com.example.mercaweb.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminDteo {

    private int id;
    private String nombres;
    private String contra;
    private  String email;
    private String rol;
    private Boolean active;

}
