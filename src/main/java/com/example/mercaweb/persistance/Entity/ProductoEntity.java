package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    private Long id;
    @Column(name = "nombres")
    private String name;
    private String descripcion;
    private Double precio;
    private String foto;

}
