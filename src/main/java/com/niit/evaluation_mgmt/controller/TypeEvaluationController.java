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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.TypeEvaluation;
import com.niit.evaluation_mgmt.service.TypeEvaluationService;

@RestController
@CrossOrigin
@RequestMapping(value = "/typeEvaluation")
public class TypeEvaluationController {

    private final TypeEvaluationService service;

    public TypeEvaluationController(TypeEvaluationService service) {
        this.service = service;
    }

    @PostMapping(value="/")
    public TypeEvaluation create(@RequestBody TypeEvaluation typeEvaluation) {
        return service.create(typeEvaluation);
    }
    
    @GetMapping(value="/{id}")
    public Optional<TypeEvaluation> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping(value="/")
    public List<TypeEvaluation> getAll(@RequestParam String typeEvaluation) {
        return service.getAll();
    }

    @PutMapping(value="/")
    public TypeEvaluation update(@RequestBody TypeEvaluation typeEvaluation) {
        return service.update(typeEvaluation);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
}