package com.niit.evaluation_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class TypeEvaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Evaluation> evaluations;


    public TypeEvaluation() {
    }

    public TypeEvaluation(Long id, String designation, List<Evaluation> evaluations) {
        this.id = id;
        this.designation = designation;
        this.evaluations = evaluations;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Evaluation> getEvaluations() {
        return this.evaluations;
    }

    public void setEvaluations(List<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public TypeEvaluation id(Long id) {
        setId(id);
        return this;
    }

    public TypeEvaluation designation(String designation) {
        setDesignation(designation);
        return this;
    }

    public TypeEvaluation evaluations(List<Evaluation> evaluations) {
        setEvaluations(evaluations);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TypeEvaluation)) {
            return false;
        }
        TypeEvaluation typeEvaluation = (TypeEvaluation) o;
        return Objects.equals(id, typeEvaluation.id) && Objects.equals(designation, typeEvaluation.designation) && Objects.equals(evaluations, typeEvaluation.evaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, designation, evaluations);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", designation='" + getDesignation() + "'" +
            ", evaluations='" + getEvaluations() + "'" +
            "}";
    }
    
   

}