package com.example.mercaweb.persistance.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="admin")
@Getter
@Setter
public class AdminEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int     id;
        private String nombres;
        @Column(name ="usuario")
        private  String usuarios;
        @Column(name ="contrasenia")
        private String contra;
        @Column(name ="correo")
        private  String email;





}
