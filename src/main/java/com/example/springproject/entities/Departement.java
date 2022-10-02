package com.example.springproject.entities;

import javax.persistence.*;

@Entity
public class Departement {

    //Declaration l id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart; // Clé primaire

    private String nomDepart ;

    public Long getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(Long idDepart) {
        this.idDepart = idDepart;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }
}
