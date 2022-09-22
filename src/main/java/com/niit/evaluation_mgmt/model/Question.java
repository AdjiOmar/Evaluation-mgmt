package com.niit.evaluation_mgmt.model;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libele;
    private String goodAwnser;
    @ElementCollection
    private List<String> options ;
    private boolean isGood;
    


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
     * @return String return the libele
     */
    public String getLibele() {
        return libele;
    }

    /**
     * @param libele the libele to set
     */
    public void setLibele(String libele) {
        this.libele = libele;
    }

    /**
     * @return String return the goodAwnser
     */
    public String getGoodAwnser() {
        return goodAwnser;
    }

    /**
     * @param goodAwnser the goodAwnser to set
     */
    public void setGoodAwnser(String goodAwnser) {
        this.goodAwnser = goodAwnser;
    }

    /**
     * @return List<String> return the options
     */
    public List<String> getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(List<String> options) {
        this.options = options;
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