package com.niit.evaluation_mgmt.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libele;
    private String reponse1;
    private String reponse2;
    private String reponse3;
    private String reponse4;
    private String bonneReponse;
    private String reponse;
    private boolean isGood;

    // @ManyToMany(cascade = CascadeType.ALL)
    // private List<Evaluation> evaluations;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private Evaluation evaluation;

    public Question() {
    }

    public Question(Long id, String libele, String reponse1, String reponse2, String reponse3, String reponse4,
            String bonneReponse, String reponse) {
        this.id = id;
        this.libele = libele;
        this.reponse1 = reponse1;
        this.reponse2 = reponse2;
        this.reponse3 = reponse3;
        this.reponse4 = reponse4;
        this.reponse = reponse;
        this.bonneReponse = bonneReponse;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibele() {
        return this.libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getReponse1() {
        return this.reponse1;
    }

    public void setReponse1(String reponse1) {
        this.reponse1 = reponse1;
    }

    public String getReponse2() {
        return this.reponse2;
    }

    public void setReponse2(String reponse2) {
        this.reponse2 = reponse2;
    }

    public String getReponse3() {
        return this.reponse3;
    }

    public void setReponse3(String reponse3) {
        this.reponse3 = reponse3;
    }

    public String getReponse4() {
        return this.reponse4;
    }

    public void setReponse4(String reponse4) {
        this.reponse4 = reponse4;
    }

    public String getBonneReponse() {
        return this.bonneReponse;
    }

    public void setBonneReponse(String bonneReponse) {
        this.bonneReponse = bonneReponse;
    }

     public String getReponse() {
        return this.bonneReponse;
    }

    public void setReponse(String reponse ) {
        this.reponse = reponse;
    }

    public Question id(Long id) {
        setId(id);
        return this;
    }

    public Question libele(String libele) {
        setLibele(libele);
        return this;
    }

    public Question reponse1(String reponse1) {
        setReponse1(reponse1);
        return this;
    }

    public Question reponse2(String reponse2) {
        setReponse2(reponse2);
        return this;
    }

    public Question reponse3(String reponse3) {
        setReponse3(reponse3);
        return this;
    }

    public Question reponse4(String reponse4) {
        setReponse4(reponse4);
        return this;
    }

    public Question bonneReponse(String bonneReponse) {
        setBonneReponse(bonneReponse);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Question)) {
            return false;
        }

        Question question = (Question) o;
        return Objects.equals(id, question.id) && Objects.equals(libele, question.libele)
                && Objects.equals(reponse1, question.reponse1) && Objects.equals(reponse2, question.reponse2)
                && Objects.equals(reponse3, question.reponse3) && Objects.equals(reponse4, question.reponse4)
                && Objects.equals(bonneReponse, question.bonneReponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libele, reponse1, reponse2, reponse3, reponse4, bonneReponse);
    }


    /**
     * @return Evaluation return the evaluation
     */
    public Evaluation getEvaluation() {
        return evaluation;
    }

    /**
     * @param evaluation the evaluation to set
     */
    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    


    /**
     * @return boolean return the isGood
     */
    public boolean isIsGood() {
        return isGood;
    }

    /**
     * @param isGood the isGood to set
     */
    public void setIsGood(boolean isGood) {
        this.isGood = isGood;
    }

}