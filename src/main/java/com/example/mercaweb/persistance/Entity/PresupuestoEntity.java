package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "presu")
public class PresupuestoEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //el detalle para que es el presupuesto.
    @Column(name = "detpresuid")
    private String DetPresupuesto;
    @Column(name = "usuariid")
    private Integer usuariokey;
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "usuariid",insertable=false, updatable = false)
    private UsuarioEntity usuarioEntity;

}
