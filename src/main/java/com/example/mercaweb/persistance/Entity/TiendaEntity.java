package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "tienda")
public class TiendaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String descripcion;
    private String logo;
    @Column(name = "mercadoid")
    private  Integer mercadokey;

    @ManyToOne
    @JoinColumn(name = "mercadoid",insertable=false, updatable = false)
    private MercadoEntity mercadoEntity;

    @OneToMany(mappedBy = "tiendaEntity", orphanRemoval = true)
    private List<DetProdcutoEntity> detProdcutoEntities = new ArrayList<>();

}
