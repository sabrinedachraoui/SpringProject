package com.example.springproject.entities;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.Date;

@Entity
public class Contrat {
      //Declaration l id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat; // Clé primaire


    private Date dateDebutContrat ;
    private Date dateFinContrat ;
    private Specialite Specialite;
    private Boolean archive;

    public Long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public com.example.springproject.entities.Specialite getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(com.example.springproject.entities.Specialite specialite) {
        Specialite = specialite;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}
