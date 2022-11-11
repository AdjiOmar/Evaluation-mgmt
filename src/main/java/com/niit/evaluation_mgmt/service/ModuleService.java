package com.niit.evaluation_mgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Module;
import com.niit.evaluation_mgmt.repository.ModuleRepository;

@Service
public class ModuleService {

    private final ModuleRepository repo;

    public ModuleService(ModuleRepository repo) {
        this.repo = repo;
        
    }

    public List<Module> getAll() {
        return repo.findAll();
    }
     public Module getById(Long id) {
        return repo.getById(id);
    }

    public Module create(Module module) {
        Module m = repo.save(module);
       
        return m;
    }

    

    public Module update(Module module) {
        return repo.save(module);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}