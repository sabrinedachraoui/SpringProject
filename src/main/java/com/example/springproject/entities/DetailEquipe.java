package com.example.springproject.entities;
import javax.persistence.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

public class DetailEquipe {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="salle")
    private int salle; // Clé primaire

    private String thematique;

    public int getSalle() {
        return salle;
    }

    public void setSalle(int salle) {
        this.salle = salle;
    }

    public String getThematique() {
        return thematique;
    }

    public void setThematique(String thematique) {
        this.thematique = thematique;
    }
}
