package com.niit.evaluation_mgmt.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String appreciation;
  //  private List <Question> questions;
    private double resultat;
    private LocalTime duration;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Question> questions;

    @ManyToOne(cascade = CascadeType.ALL)
    private TypeEvaluation typeEvaluation;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Module module;
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
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return String return the appreciation
     */
    public String getAppreciation() {
        return appreciation;
    }

    /**
     * @param appreciation the appreciation to set
     */
    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }

    /**
     * @return double return the resultat
     */
    public double getResultat() {
        return resultat;
    }

    /**
     * @param resultat the resultat to set
     */
    public void setResultat(double resultat) {
        this.resultat = resultat;
    }

    /**
     * @return LocalTime return the duration
     */
    public LocalTime getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }


    /**
     * @return List<Question> return the questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     * @return TypeEvaluation return the typeEvaluation
     */
    public TypeEvaluation getTypeEvaluation() {
        return typeEvaluation;
    }

    /**
     * @param typeEvaluation the typeEvaluation to set
     */
    public void setTypeEvaluation(TypeEvaluation typeEvaluation) {
        this.typeEvaluation = typeEvaluation;
    }

}