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

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return nomE;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Enumerated(EnumType.STRING)

    private Option option;

// Constructeur et accesseurs (getters) et mutateurs (setters)

}
