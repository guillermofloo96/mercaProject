package com.example.mercaweb.persistance.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "mercado")
public class MercadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "codigoident")
    private String codIdentidad;
    private String nombre;
    private String logo;
    @Column(name = "municipioid")
    private Integer municipioKey;


    @ManyToOne
    @JoinColumn(name = "municipioid", insertable=false, updatable = false)
    private MunicipioEntity municipioEntity;

    @OneToMany(mappedBy = "mercadoEntity", orphanRemoval = true)
    private List<TiendaEntity> tiendaEntities = new ArrayList<>();

}
