package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

}
