package com.example.mercaweb.domain.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.SecondaryTable;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DetPresupuestoDto {
    private Integer id;
    private  Integer detproductKey;
    private Integer presupKey;
    private String tiendaname;
    private String productname;



}
