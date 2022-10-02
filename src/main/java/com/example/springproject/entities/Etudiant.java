package com.example.springproject.entities;

import javax.persistence.*;

@Entity
public class Etudiant {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idEtudiant")

    private Long idEtudiant; // Clé primaire

    private String prenomE;

    private String nomE;

    @Enumerated(EnumType.STRING)

    private Option option;

// Constructeur et accesseurs (getters) et mutateurs (setters)

}
