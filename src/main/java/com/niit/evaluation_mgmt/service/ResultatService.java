package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Resultat;
import com.niit.evaluation_mgmt.repository.ResultatRepository;

@Service
public class ResultatService {
     private final ResultatRepository repo;

    public ResultatService(ResultatRepository repo) {
        this.repo = repo;
    }

    public List<Resultat> getAll() {
        return repo.findAll();
    }

    public Optional<Resultat> getById(Long id) {
        return repo.findById(id);
    }

    public Resultat create(Resultat resultat) {
        return repo.save(resultat);
    }

    public Resultat update(Resultat resultat) {
        return repo.save(resultat);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
    
