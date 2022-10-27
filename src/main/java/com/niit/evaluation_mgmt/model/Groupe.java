package com.niit.evaluation_mgmt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Apprenant> apprenants;

    @ManyToOne(cascade = CascadeType.ALL)
    private Groupe groupe;


    public Groupe() {
    }

    public Groupe(Long id, String code, List<Apprenant> apprenants) {
        this.id = id;
        this.code = code;
        this.apprenants = apprenants;
    }

       

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
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return List<Apprenant> return the apprenants
     */
    public List<Apprenant> getApprenants() {
        return apprenants;
    }

    /**
     * @param apprenants the apprenants to set
     */
    public void setApprenants(List<Apprenant> apprenants) {
        this.apprenants = apprenants;
    }

}