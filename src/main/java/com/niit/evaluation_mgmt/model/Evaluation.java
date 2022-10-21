package com.niit.evaluation_mgmt.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private LocalDate date;
    private int nbreQuestion;
    //  private List <Question> questions;
    // private double resultat;
    private LocalTime duration;

    // @ManyToMany(cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "evaluation")
    private List<Question> questions;

    @ManyToOne(cascade = CascadeType.ALL)
    private TypeEvaluation typeEvaluation;

    @ManyToOne(cascade = CascadeType.ALL)
    private Module module;

    @ManyToOne(cascade = CascadeType.ALL)
    private Apprenant apprenant;

    public Evaluation() {
    }

    public Evaluation(Long id, String nom, String description, LocalDate date, int nbreQuestion, LocalTime duration,
            List<Question> questions, TypeEvaluation typeEvaluation, Module module, Apprenant apprenant) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.nbreQuestion = nbreQuestion;
        this.duration = duration;
        this.questions = questions;
        this.typeEvaluation = typeEvaluation;
        this.module = module;
        this.apprenant = apprenant;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNbreQuestion() {
        return this.nbreQuestion;
    }

    public void setNbreQuestion(int nbreQuestion) {
        this.nbreQuestion = nbreQuestion;
    }

    public LocalTime getDuration() {
        return this.duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public TypeEvaluation getTypeEvaluation() {
        return this.typeEvaluation;
    }

    public void setTypeEvaluation(TypeEvaluation typeEvaluation) {
        this.typeEvaluation = typeEvaluation;
    }

    public Module getModule() {
        return this.module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Apprenant getApprenant() {
        return this.apprenant;
    }

    public void setApprenant(Apprenant apprenant) {
        this.apprenant = apprenant;
    }

    public Evaluation id(Long id) {
        setId(id);
        return this;
    }

    public Evaluation nom(String nom) {
        setNom(nom);
        return this;
    }

    public Evaluation description(String description) {
        setDescription(description);
        return this;
    }

    public Evaluation date(LocalDate date) {
        setDate(date);
        return this;
    }

    public Evaluation nbreQuestion(int nbreQuestion) {
        setNbreQuestion(nbreQuestion);
        return this;
    }

    public Evaluation duration(LocalTime duration) {
        setDuration(duration);
        return this;
    }

    public Evaluation questions(List<Question> questions) {
        setQuestions(questions);
        return this;
    }

    public Evaluation typeEvaluation(TypeEvaluation typeEvaluation) {
        setTypeEvaluation(typeEvaluation);
        return this;
    }

    public Evaluation module(Module module) {
        setModule(module);
        return this;
    }

    public Evaluation apprenant(Apprenant apprenant) {
        setApprenant(apprenant);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Evaluation)) {
            return false;
        }
        Evaluation evaluation = (Evaluation) o;
        return Objects.equals(id, evaluation.id) && Objects.equals(nom, evaluation.nom)
                && Objects.equals(description, evaluation.description) && Objects.equals(date, evaluation.date)
                && Objects.equals(nbreQuestion, evaluation.nbreQuestion)
                && Objects.equals(duration, evaluation.duration) && Objects.equals(questions, evaluation.questions)
                && Objects.equals(typeEvaluation, evaluation.typeEvaluation)
                && Objects.equals(module, evaluation.module) && Objects.equals(apprenant, evaluation.apprenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, description, date, nbreQuestion, duration, questions, typeEvaluation, module,
                apprenant);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nom='" + getNom() + "'" +
                ", description='" + getDescription() + "'" +
                ", date='" + getDate() + "'" +
                ", nbreQuestion='" + getNbreQuestion() + "'" +
                ", duration='" + getDuration() + "'" +
                ", questions='" + getQuestions() + "'" +
                ", typeEvaluation='" + getTypeEvaluation() + "'" +
                ", module='" + getModule() + "'" +
                ", apprenant='" + getApprenant() + "'" +
                "}";
    }

}