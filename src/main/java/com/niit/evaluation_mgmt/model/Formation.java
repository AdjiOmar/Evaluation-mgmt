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
    private String nom;
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

    public Formation(Long id, String nom,String dureeFormation, String typeFormation, List<Module> modules, List<Apprenant> apprenants, List<Formateur> formateurs) {
        this.id = id;
        this.nom = nom;
        this.dureeFormation = dureeFormation;
        this.typeFormation = typeFormation;
        this.modules = modules;
        this.apprenants = apprenants;
        this.formateurs = formateurs;
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

    public Formation id(Long id) {
        setId(id);
        return this;
    }

    public Formation dureeFormation(String dureeFormation) {
        setDureeFormation(dureeFormation);
        return this;
    }

    public Formation typeFormation(String typeFormation) {
        setTypeFormation(typeFormation);
        return this;
    }

    public Formation modules(List<Module> modules) {
        setModules(modules);
        return this;
    }

    public Formation apprenants(List<Apprenant> apprenants) {
        setApprenants(apprenants);
        return this;
    }

    public Formation formateurs(List<Formateur> formateurs) {
        setFormateurs(formateurs);
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
        return Objects.equals(id, formation.id) && Objects.equals(dureeFormation, formation.dureeFormation) && Objects.equals(typeFormation, formation.typeFormation) && Objects.equals(modules, formation.modules) && Objects.equals(apprenants, formation.apprenants) && Objects.equals(formateurs, formation.formateurs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dureeFormation, typeFormation, modules, apprenants, formateurs);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", dureeFormation='" + getDureeFormation() + "'" +
            ", typeFormation='" + getTypeFormation() + "'" +
            ", modules='" + getModules() + "'" +
            ", apprenants='" + getApprenants() + "'" +
            ", formateurs='" + getFormateurs() + "'" +
            "}";
    }


    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return List<Module> return the modules
     */
    public List<Module> getModules() {
        return modules;
    }

    /**
     * @param modules the modules to set
     */
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    /**
     * @return List<Apprenant> return the apprenants
     */
    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    /**
     * @param apprenants the apprenants to set
     */
    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    /**
     * @return List<Formateur> return the formateurs
     */
    public List<Formateur> getFormateurs() {
        return formateurs;
    }

    /**
     * @param formateurs the formateurs to set
     */
    public void setFormateurs(List<Formateur> formateurs) {
        this.formateurs = formateurs;
    }


    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

}