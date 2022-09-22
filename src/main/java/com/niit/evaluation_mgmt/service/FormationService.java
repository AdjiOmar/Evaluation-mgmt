package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Formation;
import com.niit.evaluation_mgmt.repository.FormationRepository;

@Service
public class FormationService {

    private final FormationRepository repo;


    public FormationService(FormationRepository repo) {
        this.repo = repo;
    }

    public List<Formation> getAll() {
        return repo.findAll();
    }

    public Optional<Formation> getById(Long id) {
        return repo.findById(id);
    }

    public Formation create(Formation formation) {
        return repo.save(formation);
    }

    public Formation update(Formation formation) {
        return repo.save(formation);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}