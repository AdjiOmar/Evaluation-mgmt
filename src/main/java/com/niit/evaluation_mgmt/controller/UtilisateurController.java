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
import com.niit.evaluation_mgmt.model.Utilisateur;
import com.niit.evaluation_mgmt.service.UtilisateurService;

@RestController
@CrossOrigin
@RequestMapping(value = "/utilisateur")
public class UtilisateurController {

    private final UtilisateurService service;

    public UtilisateurController(UtilisateurService service) {
        this.service = service;
    }
    @PostMapping
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        return service.create(utilisateur);
    }
    @GetMapping(value="/{id}")
    public Optional<Utilisateur> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Utilisateur> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Utilisateur update(@RequestBody Utilisateur utilisateur) {
                return service.update(utilisateur);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
}