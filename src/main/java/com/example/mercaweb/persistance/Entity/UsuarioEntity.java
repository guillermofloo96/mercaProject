package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter@Getter
@RequiredArgsConstructor
@Table(name = "usuari")

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)


    private Integer id;
    @Column(name = "nombres")
    private String names;
    @Column(name= "correo")
    private String email;
    @Column(name = "activo")
    private Boolean active;

    @OneToMany(mappedBy = "usuarioEntity", orphanRemoval = true)
    private List<PresupuestoEntity> presupuestoEntities = new ArrayList<>();

}
