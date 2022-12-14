package com.niit.evaluation_mgmt.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Utilisateur{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private String username;
    private String password;
    @ElementCollection
    private List <String> roles;


    public Utilisateur() {
    }

    public Utilisateur(Long id, String nom, String prenom, String adresse, String email, String username, String password, List<String> roles) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.username = username;
        this.password = password;
        this.roles = roles;
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

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Utilisateur id(Long id) {
        setId(id);
        return this;
    }

    public Utilisateur nom(String nom) {
        setNom(nom);
        return this;
    }

    public Utilisateur prenom(String prenom) {
        setPrenom(prenom);
        return this;
    }

    public Utilisateur adresse(String adresse) {
        setAdresse(adresse);
        return this;
    }

    public Utilisateur email(String email) {
        setEmail(email);
        return this;
    }

    public Utilisateur username(String username) {
        setUsername(username);
        return this;
    }

    public Utilisateur password(String password) {
        setPassword(password);
        return this;
    }

    public Utilisateur roles(List<String> roles) {
        setRoles(roles);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Utilisateur)) {
            return false;
        }
        Utilisateur gestionnaire = (Utilisateur) o;
        return Objects.equals(id, gestionnaire.id) && Objects.equals(nom, gestionnaire.nom) && Objects.equals(prenom, gestionnaire.prenom) && Objects.equals(adresse, gestionnaire.adresse) && Objects.equals(email, gestionnaire.email) && Objects.equals(username, gestionnaire.username) && Objects.equals(password, gestionnaire.password) && Objects.equals(roles, gestionnaire.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, adresse, email, username, password, roles);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nom='" + getNom() + "'" +
            ", prenom='" + getPrenom() + "'" +
            ", adresse='" + getAdresse() + "'" +
            ", email='" + getEmail() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", roles='" + getRoles() + "'" +
            "}";
    }


}