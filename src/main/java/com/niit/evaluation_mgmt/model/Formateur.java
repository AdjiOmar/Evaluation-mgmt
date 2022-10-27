package com.niit.evaluation_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Formateur extends Utilisateur {
    
    private String specialite;
    private String matricule;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Formation> formations;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Seance> seances; 


    public Formateur() {
    }

    public Formateur(String specialite, String matricule) {
        this.specialite = specialite;
        this.matricule = matricule;
    }

    public String getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Formateur specialite(String specialite) {
        setSpecialite(specialite);
        return this;
    }

    public Formateur matricule(String matricule) {
        setMatricule(matricule);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Formateur)) {
            return false;
        }
        Formateur formateur = (Formateur) o;
        return Objects.equals(specialite, formateur.specialite) && Objects.equals(matricule, formateur.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialite, matricule);
    }

    @Override
    public String toString() {
        return "{" +
            " specialite='" + getSpecialite() + "'" +
            ", matricule='" + getMatricule() + "'" +
            "}";
    }

    
}