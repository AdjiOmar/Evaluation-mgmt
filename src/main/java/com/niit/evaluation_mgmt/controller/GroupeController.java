package com.niit.evaluation_mgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Groupe;
import com.niit.evaluation_mgmt.service.GroupeService;

@RestController
@RequestMapping(value = "/groupe")
public class GroupeController {

    private final GroupeService service;

    public GroupeController(GroupeService service) {
        this.service = service;
    }

    @PostMapping
    public Groupe create(@RequestBody Groupe groupe) {
        return service.create(groupe);
    }
    @GetMapping(value="/{id}")
    public Optional<Groupe> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    @GetMapping
    public List<Groupe> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Groupe update(@RequestBody Groupe groupe) {
        return service.update(groupe);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    
}