package com.niit.evaluation_mgmt.controller;

import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Evaluation;
import com.niit.evaluation_mgmt.service.EvaluationService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@CrossOrigin(origins= "http://localhost:4200", allowedHeaders = "*")
@RequestMapping(value="/evaluation")
public class EvaluationController {

    private final EvaluationService service;

    public EvaluationController(EvaluationService service
            // , ModuleService modService
    ) {
        this.service = service;
        // this.modService = modService;
    }
    // private final ModuleService modService;

   

    @PostMapping
    public ResponseEntity<Evaluation> create(@RequestBody Evaluation evaluation) { 
        return ResponseEntity.ok(service.create(evaluation));
    }
    @GetMapping(value="/{id}")
    public Evaluation getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Evaluation> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Evaluation update(@RequestBody Evaluation evaluation) {
        return service.update(evaluation);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    
    // @GetMapping(value = "/module/{id}")
    // public List<Evaluation> findByModule(@PathVariable("id") Long id) {
    //     return service.findByModule(id);
    // }
    
}