package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "usuariid",insertable=false, updatable = false)
    private UsuarioEntity usuarioEntity;

    @OneToMany(mappedBy = "presupuestoEntity", orphanRemoval = true)
    private List<DetPresupEntity> detPresupEntities = new ArrayList<>();

}
