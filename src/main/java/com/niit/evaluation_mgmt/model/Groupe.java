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
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Apprenant> apprenants;


    public Groupe() {
    }

    public Groupe(Long id, String code, List<Apprenant> apprenants) {
        this.id = id;
        this.code = code;
        this.apprenants = apprenants;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Apprenant> getApprenants() {
        return this.apprenants;
    }

    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

    public Groupe id(Long id) {
        setId(id);
        return this;
    }

    public Groupe code(String code) {
        setCode(code);
        return this;
    }

    public Groupe apprenants(List<Apprenant> apprenants) {
        setApprenants(apprenants);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Groupe)) {
            return false;
        }
        Groupe groupe = (Groupe) o;
        return Objects.equals(id, groupe.id) && Objects.equals(code, groupe.code) && Objects.equals(apprenants, groupe.apprenants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, apprenants);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", code='" + getCode() + "'" +
            ", apprenants='" + getApprenants() + "'" +
            "}";
    }


    
}