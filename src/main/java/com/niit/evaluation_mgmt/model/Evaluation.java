package com.niit.evaluation_mgmt.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evalId")
    private Long evalId;
    private String nom;
    @Column(length = 3000)
    private String description;
    private LocalDate date;
    private int nbreQuestion;
    private int noteMaximal;
    private boolean active = false;
    //  private List <Question> questions;
    // private double resultat;
    private LocalTime duration;
    // @ManyToMany(cascade = CascadeType.ALL)
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY,
               mappedBy = "evaluation")
    private Set<Question> questions;

    @ManyToOne(cascade = CascadeType.ALL)
    private TypeEvaluation typeEvaluation;

    @ManyToOne(fetch = FetchType.EAGER)
    private Module module;

    @ManyToOne(cascade = CascadeType.ALL)
    private Apprenant apprenant;

    public Evaluation() {
    }

    public Evaluation(Long evalId, String nom, String description, LocalDate date, int nbreQuestion, int noteMaximal, LocalTime duration,
            Set<Question> questions, TypeEvaluation typeEvaluation, Module module, Apprenant apprenant, boolean active) {
        this.evalId = evalId;
        this.nom = nom;
        this.description = description;
        this.date = date;
        this.nbreQuestion = nbreQuestion;
        this.noteMaximal = noteMaximal;
        this.duration = duration;
        this.questions = questions;
        this.typeEvaluation = typeEvaluation;
        this.module = module;
        this.apprenant = apprenant;
        this.active = active;
    }

    public Long getEvalId() {
        return evalId;
    }

    public void setEvalId(Long evalId) {
        this.evalId = evalId;
    }

    public int getNoteMaximal() {
        return noteMaximal;
    }

    public void setNoteMaximal(int noteMaximal) {
        this.noteMaximal = noteMaximal;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Long getId() {
        return this.evalId;
    }

    public void setId(Long evalId) {
        this.evalId = evalId;
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

    public Set<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(Set<Question> questions) {
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

    public Evaluation questions(Set<Question> questions) {
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
        return Objects.equals(evalId, evaluation.evalId) && Objects.equals(nom, evaluation.nom)
                && Objects.equals(description, evaluation.description) && Objects.equals(date, evaluation.date)
                && Objects.equals(nbreQuestion, evaluation.nbreQuestion)
                && Objects.equals(duration, evaluation.duration) && Objects.equals(questions, evaluation.questions)
                && Objects.equals(typeEvaluation, evaluation.typeEvaluation)
                && Objects.equals(module, evaluation.module) && Objects.equals(apprenant, evaluation.apprenant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evalId, nom, description, date, nbreQuestion, duration, questions, typeEvaluation, module,
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