package com.niit.evaluation_mgmt.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Resultat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nbrQuesTrouve;
    private double pourcentage;
    @OneToOne
    private Evaluation evaluation;


    public Resultat() {
    }

    public Resultat(int nbrQuesTrouve, double pourcentage, Evaluation evaluation) {
        this.nbrQuesTrouve = nbrQuesTrouve;
        this.pourcentage = pourcentage;
        this.evaluation = evaluation;
    }

    public int getNbrQuesTrouve() {
        return this.nbrQuesTrouve;
    }

    public void setNbrQuesTrouve(int nbrQuesTrouve) {
        this.nbrQuesTrouve = nbrQuesTrouve;
    }

    public double getPourcentage() {
        return this.pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Evaluation getEvaluation() {
        return this.evaluation;
    }

    public void setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
    }

    public Resultat nbrQuesTrouve(int nbrQuesTrouve) {
        setNbrQuesTrouve(nbrQuesTrouve);
        return this;
    }

    public Resultat pourcentage(double pourcentage) {
        setPourcentage(pourcentage);
        return this;
    }

    public Resultat evaluation(Evaluation evaluation) {
        setEvaluation(evaluation);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Resultat)) {
            return false;
        }
        Resultat resultat = (Resultat) o;
        return nbrQuesTrouve == resultat.nbrQuesTrouve && pourcentage == resultat.pourcentage && Objects.equals(evaluation, resultat.evaluation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nbrQuesTrouve, pourcentage, evaluation);
    }

    @Override
    public String toString() {
        return "{" +
            " nbrQuesTrouve='" + getNbrQuesTrouve() + "'" +
            ", pourcentage='" + getPourcentage() + "'" +
            ", evaluation='" + getEvaluation() + "'" +
            "}";
    }
    
}