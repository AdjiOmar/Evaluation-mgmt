package com.niit.evaluation_mgmt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Apprenant;
import com.niit.evaluation_mgmt.service.ApprenantService;

@RestController
// @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@CrossOrigin
@RequestMapping(value = "/apprenant")
public class ApprenantController {
    private final ApprenantService service;

    public ApprenantController(ApprenantService service) {
        this.service = service;
    }

    @PostMapping
    public Apprenant create(@RequestBody @Validated  Apprenant apprenant) {
        return service.create(apprenant);
    }
    @GetMapping(value="/{id}")
    public Optional<Apprenant> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Apprenant> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Apprenant update(@RequestBody Apprenant apprenant) {
        return service.update(apprenant);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    
}