package com.niit.evaluation_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Apprenant extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @NotBlank
     private String matricule;
     private String niveau;

     @OneToOne(cascade = CascadeType.ALL)
     private Formation  formation;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Groupe groupe;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Evaluation> evaluations;


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

    


    /**
     * @return Formation return the formation
     */
    public Formation getFormation() {
        return formation;
    }

    /**
     * @param formation the formation to set
     */
    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    /**
     * @return Groupe return the groupe
     */
    public Groupe getGroupe() {
        return groupe;
    }

    /**
     * @param groupe the groupe to set
     */
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    /**
     * @return List<Evaluation> return the evaluations
     */
    public List<Evaluation> getEvaluations() {
        return evaluations;
    }

    /**
     * @param evaluations the evaluations to set
     */
    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

}