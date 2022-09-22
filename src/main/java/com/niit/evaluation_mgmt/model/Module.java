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
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private int volumehoraire;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Evaluation> evaluations;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Formation> formations;



    public Module() {
    }

    public Module(Long id, String nom, int volumehoraire) {
        this.id = id;
        this.nom = nom;
        this.volumehoraire = volumehoraire;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVolumehoraire() {
        return this.volumehoraire;
    }

    public void setVolumehoraire(int volumehoraire) {
        this.volumehoraire = volumehoraire;
    }

    public Module id(Long id) {
        setId(id);
        return this;
    }

    public Module nom(String nom) {
        setNom(nom);
        return this;
    }

    public Module volumehoraire(int volumehoraire) {
        setVolumehoraire(volumehoraire);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Module)) {
            return false;
        }
        Module module = (Module) o;
        return Objects.equals(id, module.id) && Objects.equals(nom, module.nom) && volumehoraire == module.volumehoraire;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, volumehoraire);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nom='" + getNom() + "'" +
            ", volumehoraire='" + getVolumehoraire() + "'" +
            "}";
    }
    
}