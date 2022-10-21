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

import com.niit.evaluation_mgmt.model.Gestionnaire;
import com.niit.evaluation_mgmt.service.GestionnaireService;

@RestController
@CrossOrigin
@RequestMapping(value = "/gestionnaire")
public class GestionnaireController {

    private final GestionnaireService service;

    public GestionnaireController(GestionnaireService service) {
        this.service = service;
    }

    @PostMapping
    public Gestionnaire create(@RequestBody Gestionnaire gestionnaire) { 
        return service.create(gestionnaire);
    }
    @GetMapping(value="/{id}")
    public Optional<Gestionnaire> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Gestionnaire> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Gestionnaire update(@RequestBody Gestionnaire gestionnaire) {
        return service.update(gestionnaire);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
}