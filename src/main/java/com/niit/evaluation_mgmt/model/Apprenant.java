package com.niit.evaluation_mgmt.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Apprenant extends Gestionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @NotBlank
     private String matricule;
     private String niveau;

     @OneToOne(cascade = CascadeType.ALL)
     private Formation  formation;

    @ManyToOne(cascade = CascadeType.ALL)
    private Groupe groupe;


    public Apprenant() {
    }

    public Apprenant(Long id, String matricule, String niveau) {
        this.id = id;
        this.matricule = matricule;
        this.niveau = niveau;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNiveau() {
        return this.niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Apprenant id(Long id) {
        setId(id);
        return this;
    }

    public Apprenant matricule(String matricule) {
        setMatricule(matricule);
        return this;
    }

    public Apprenant niveau(String niveau) {
        setNiveau(niveau);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Apprenant)) {
            return false;
        }
        Apprenant apprenant = (Apprenant) o;
        return Objects.equals(id, apprenant.id) && Objects.equals(matricule, apprenant.matricule) && Objects.equals(niveau, apprenant.niveau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, matricule, niveau);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", matricule='" + getMatricule() + "'" +
            ", niveau='" + getNiveau() + "'" +
            "}";
    }

}