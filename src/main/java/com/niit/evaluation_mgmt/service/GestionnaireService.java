package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Gestionnaire;
import com.niit.evaluation_mgmt.repository.GestionnaireRepository;

@Service
public class GestionnaireService {
    private final GestionnaireRepository repo;


    public GestionnaireService(GestionnaireRepository repo) {
        this.repo = repo;
    }

    public List<Gestionnaire> getAll() {
        return repo.findAll();
    }

    public Optional<Gestionnaire> getById(Long id) {
        return repo.findById(id);
    }

    public Gestionnaire create(Gestionnaire gestionnaire) {
        return repo.save(gestionnaire);
    }

    public Gestionnaire update(Gestionnaire gestionnaire) {
        return repo.save(gestionnaire);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}