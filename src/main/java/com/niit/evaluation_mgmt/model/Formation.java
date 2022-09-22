package com.niit.evaluation_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Formation {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dureeFormation;
    private String typeFormation;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Module> modules;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Apprenant> apprenants;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Formateur> formateurs;



    public Formation() {
    }

    public Formation(String dureeFormation, String typeFormation) {
        this.dureeFormation = dureeFormation;
        this.typeFormation = typeFormation;
    }

    public String getDureeFormation() {
        return this.dureeFormation;
    }

    public void setDureeFormation(String dureeFormation) {
        this.dureeFormation = dureeFormation;
    }

    public String getTypeFormation() {
        return this.typeFormation;
    }

    public void setTypeFormation(String typeFormation) {
        this.typeFormation = typeFormation;
    }

    public Formation dureeFormation(String dureeFormation) {
        setDureeFormation(dureeFormation);
        return this;
    }

    public Formation typeFormation(String typeFormation) {
        setTypeFormation(typeFormation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Formation)) {
            return false;
        }
        Formation formation = (Formation) o;
        return Objects.equals(dureeFormation, formation.dureeFormation) && Objects.equals(typeFormation, formation.typeFormation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dureeFormation, typeFormation);
    }

    @Override
    public String toString() {
        return "{" +
            " dureeFormation='" + getDureeFormation() + "'" +
            ", typeFormation='" + getTypeFormation() + "'" +
            "}";
    }

    
}