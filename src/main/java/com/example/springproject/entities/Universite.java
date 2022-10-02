package com.example.springproject.entities;

import javax.persistence.*;
@Entity
public class Universite {

    //Declaration l id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUniv")
    private Long idUniv; // Clé primaire

    private String nomUniv;

    public Long getIdUniv() {
        return idUniv;
    }

    public void setIdUniv(Long idUniv) {
        this.idUniv = idUniv;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
