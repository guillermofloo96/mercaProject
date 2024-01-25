package com.example.mercaweb.domain.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PresupuestoDto {
    private Integer id;
    //el detalle para que es el presupuesto.
    private String DetPresupuesto;
    private Integer usuariokey;
    private Date fecha;

}
