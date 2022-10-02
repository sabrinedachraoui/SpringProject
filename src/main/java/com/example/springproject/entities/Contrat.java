package com.example.springproject.entities;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.Date;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat; // Clé primaire

    private Date dateDebutContrat ;
    private Date dateFinContrat ;
    private Specialite Specialite;
    private Boolean archive;




}
