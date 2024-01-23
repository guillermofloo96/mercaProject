package com.example.mercaweb.persistance.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter@Getter
@RequiredArgsConstructor
@Table(name = "usuari")

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)


    private Integer id;
    @Column(columnDefinition = "nombres")
    private String names;
    @Column(columnDefinition = "correo")
    private String email;
    @Column(columnDefinition = "activo")
    private Boolean active;
}
