package com.niit.evaluation_mgmt.model;

import java.util.List;

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
    private String evaluationType;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Evaluation> evaluations;

    
   

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
     * @return String return the evaluationType
     */
    public String getEvaluationType() {
        return evaluationType;
    }

    /**
     * @param evaluationType the evaluationType to set
     */
    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
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