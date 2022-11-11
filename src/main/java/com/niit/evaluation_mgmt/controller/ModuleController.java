package com.niit.evaluation_mgmt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Module;
import com.niit.evaluation_mgmt.service.ModuleService;

@RestController
@CrossOrigin
@RequestMapping(value ="/module")
public class ModuleController {

    private final ModuleService service;

    public ModuleController(ModuleService service) {
        this.service = service;
    }

    @PostMapping
    public Module create(@RequestBody Module module) {
        return service.create(module);
    }
   
    @GetMapping(value = "/{id}")
    public Module getById(@PathVariable Long id) {
        return service.getById(id);
    }
    

    @GetMapping
    public List<Module> getAll() {
        return service.getAll();
    }

    @PutMapping
    public Module update(@RequestBody Module module) {
        return service.update(module);
    }

    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    
    
}