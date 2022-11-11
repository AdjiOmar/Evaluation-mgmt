package com.niit.evaluation_mgmt.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long Id;
     private LocalDateTime date;
     private String duree;
     private String Objectifs;
     private String resume;

     @ManyToOne(cascade = CascadeType.MERGE)
     private Module module;

     @ManyToOne(cascade = CascadeType.MERGE)
     private Formateur formateur;


    public Seance() {
    }

    public Seance(Long Id, LocalDateTime date, String duree, String Objectifs, String resume, Module module, Formateur formateur) {
        this.Id = Id;
        this.date = date;
        this.duree = duree;
        this.Objectifs = Objectifs;
        this.resume = resume;
        this.module = module;
        this.formateur = formateur;
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDuree() {
        return this.duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getObjectifs() {
        return this.Objectifs;
    }

    public void setObjectifs(String Objectifs) {
        this.Objectifs = Objectifs;
    }

    public String getResume() {
        return this.resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Formateur getFormateur() {
        return this.formateur;
    }

    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    public Seance Id(Long Id) {
        setId(Id);
        return this;
    }

    public Seance date(LocalDateTime date) {
        setDate(date);
        return this;
    }

    public Seance duree(String duree) {
        setDuree(duree);
        return this;
    }

    public Seance Objectifs(String Objectifs) {
        setObjectifs(Objectifs);
        return this;
    }

    public Seance resume(String resume) {
        setResume(resume);
        return this;
    }

    public Seance module(Module module) {
        setModule(module);
        return this;
    }

    public Seance formateur(Formateur formateur) {
        setFormateur(formateur);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Seance)) {
            return false;
        }
        Seance seance = (Seance) o;
        return Objects.equals(Id, seance.Id) && Objects.equals(date, seance.date) && Objects.equals(duree, seance.duree) && Objects.equals(Objectifs, seance.Objectifs) && Objects.equals(resume, seance.resume) && Objects.equals(module, seance.module) && Objects.equals(formateur, seance.formateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, date, duree, Objectifs, resume, module, formateur);
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", date='" + getDate() + "'" +
            ", duree='" + getDuree() + "'" +
            ", Objectifs='" + getObjectifs() + "'" +
            ", resume='" + getResume() + "'" +
            ", module='" + getModule() + "'" +
            ", formateur='" + getFormateur() + "'" +
            "}";
    }


    
}