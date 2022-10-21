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

import com.niit.evaluation_mgmt.model.Seance;
import com.niit.evaluation_mgmt.service.SeanceService;

@RestController
@CrossOrigin
@RequestMapping(value = "/seance")
public class SeanceController {

    private final SeanceService service;

    public SeanceController(SeanceService service) {
        this.service = service;
    }

    @PostMapping
    public Seance create(@RequestBody Seance seance) {
        return service.create(seance);
    }
    @GetMapping(value="/{id}")
    public Optional<Seance> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Seance> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Seance update(@RequestBody Seance seance) {
        return service.update(seance);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    
}