package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@RequiredArgsConstructor
@Table(name = "detpresu")
public class DetPresupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "detproducid")
    private  Integer detproductKey;
    @Column(name = "presuid")
    private Integer presupKey;
    @Column(name = "tienda")
    private String tiendaname;
    @Column(name = "producto")
    private String productname;

    @ManyToOne
    @JoinColumn(name = "presuid",insertable=false, updatable = false)
    private PresupuestoEntity presupuestoEntity;

    @ManyToOne
    @JoinColumn(name = "detproducid",insertable=false, updatable = false)
    private DetProdcutoEntity detProdcutoEntity;

}
