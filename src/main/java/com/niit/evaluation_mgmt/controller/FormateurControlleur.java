package com.niit.evaluation_mgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Formateur;
import com.niit.evaluation_mgmt.service.FormateurService;

@RestController
@CrossOrigin
@RequestMapping(value = "/formateur")
public class FormateurControlleur {

    private final FormateurService service;

    public FormateurControlleur(FormateurService service) {
        this.service = service;
    }

    @PostMapping
    public Formateur create(@RequestBody Formateur formateur) {
        return service.create(formateur);    
    }
    @GetMapping(value="/{id}")
    public Optional<Formateur> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Formateur> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Formateur update(@RequestBody Formateur formateur) {
        return service.update(formateur);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    
}