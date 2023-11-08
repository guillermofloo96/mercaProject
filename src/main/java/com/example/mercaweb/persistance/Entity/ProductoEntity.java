package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "nombre")
    private String name;
    @Column(name= "descripcion")
    private String descrip;
    private Double precio;

    private String foto;

}
