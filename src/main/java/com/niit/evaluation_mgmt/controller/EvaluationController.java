package com.niit.evaluation_mgmt.controller;

import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Evaluation;
import com.niit.evaluation_mgmt.service.EvaluationService;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping(value="/evaluation")
public class EvaluationController {

    private final EvaluationService service;

    public EvaluationController(EvaluationService service) {
        this.service = service;
    }

    @PostMapping
    public Evaluation create(@RequestBody Evaluation evaluation) {
        //TODO: process POST request
        
        return service.create(evaluation);
    }
    @GetMapping(value="/{id}")
    public Optional<Evaluation> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Evaluation> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Evaluation update(@RequestBody Evaluation evaluation) {
        //TODO: process PUT request
        
        return service.update(evaluation);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
}