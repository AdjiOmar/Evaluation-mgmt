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

import com.niit.evaluation_mgmt.model.Formation;
import com.niit.evaluation_mgmt.service.FormationService;

@RestController
@CrossOrigin
@RequestMapping(value = "/formation")
public class FormationController {

    private final FormationService service;

    public FormationController(FormationService service) {
        this.service = service;
    }

    @PostMapping
    public Formation create(@RequestBody Formation formation) {
        return service.create(formation);
    }
    @GetMapping(value="/{id}")
    public Optional<Formation> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Formation> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Formation update(@RequestBody Formation formation) {
        return service.update(formation);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    
}