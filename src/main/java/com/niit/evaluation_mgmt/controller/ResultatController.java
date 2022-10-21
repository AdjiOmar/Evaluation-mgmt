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

import com.niit.evaluation_mgmt.model.Resultat;
import com.niit.evaluation_mgmt.service.ResultatService;

@RestController
@CrossOrigin
@RequestMapping(value = "/resultat")
public class ResultatController {

    private final ResultatService service;

    public ResultatController(ResultatService service) {
        this.service = service;
    }

    @PostMapping
    public Resultat create(@RequestBody Resultat resultat) { 
        return service.create(resultat);
    }
    @GetMapping(value="/{id}")
    public Optional<Resultat> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Resultat> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Resultat update(@RequestBody Resultat resultat) {
        return service.update(resultat);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
}