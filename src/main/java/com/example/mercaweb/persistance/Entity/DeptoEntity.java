package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "depto")

public class DeptoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer  keydepto;

    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "deptoEntity", orphanRemoval = true)
    private List<MunicipioEntity> municipioEntities;

    @Override
    public String toString() {
        return "DeptoEntity{" +
                "keydepto=" + keydepto +
                ", name='" + name + '\'' +
                '}';
    }





}
