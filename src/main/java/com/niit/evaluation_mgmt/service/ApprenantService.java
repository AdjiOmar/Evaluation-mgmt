package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Apprenant;
import com.niit.evaluation_mgmt.repository.ApprenantRepository;

@Service
public class ApprenantService {

    private final ApprenantRepository repo;


    public ApprenantService(ApprenantRepository repo) {
        this.repo = repo;
    }

    public List<Apprenant> getAll() {
        return repo.findAll();
    }

    public Optional<Apprenant> getById(Long id) {
        return repo.findById(id);
    }

    public Apprenant create(Apprenant apprenant) {
        return repo.save(apprenant);
    }

    public Apprenant update(Apprenant apprenant) {
        return repo.save(apprenant);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}