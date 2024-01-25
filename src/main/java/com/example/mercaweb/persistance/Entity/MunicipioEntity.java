package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "municipio")

public class MunicipioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String nombre;

    @Column(name = "deptoid")
    private Integer deptokey;

    @ManyToOne
    @JoinColumn(name = "deptoid", insertable=false, updatable = false)
    private DeptoEntity deptoEntity;

    @OneToMany(mappedBy = "municipioEntity", orphanRemoval = true)
    private List<MercadoEntity> mercadoEntities;

}
