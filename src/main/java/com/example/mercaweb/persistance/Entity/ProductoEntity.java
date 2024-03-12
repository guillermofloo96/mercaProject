package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 *ENTIDAD DE PRODUCTO
 */
@Setter
@Getter
@Entity

@Table(name="producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre")
    private String nombres;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Double precio;
    @Column(name = "foto")
    private String foto;

    @OneToMany(mappedBy = "productoEntity", orphanRemoval = true)
    private List<DetProdcutoEntity> detProdcutoEntities = new ArrayList<>();

}
