package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "detproduc")
public class DetProdcutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)

    private  Integer key;
    @Column(name = "tiendaid")
    private Integer tiendakey;
    @Column(name = "productoid")
    private  Integer productokey;
    private  String categoria;

    @ManyToOne
    @JoinColumn(name = "productoid",insertable=false, updatable = false)
    private ProductoEntity productoEntity;

    @ManyToOne
    @JoinColumn(name = "tiendaid",insertable=false, updatable = false)
    private TiendaEntity tiendaEntity;

    @OneToMany(mappedBy = "detProdcutoEntity", orphanRemoval = true)
    private List<DetPresupEntity> detPresupEntities = new ArrayList<>();

}
