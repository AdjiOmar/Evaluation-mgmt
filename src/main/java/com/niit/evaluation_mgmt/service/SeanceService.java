package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Seance;
import com.niit.evaluation_mgmt.repository.SeanceRepository;

@Service
public class SeanceService {

    private final SeanceRepository repo;

    public SeanceService(SeanceRepository repo) {
        this.repo = repo;
    }
    public List<Seance> getAll() {
        return repo.findAll();
    }

    public Optional<Seance> getById(Long id) {
        return repo.findById(id);
    }

    public Seance create(Seance seance) {
        return repo.save(seance);
    }

    public Seance update(Seance seance) {
        return repo.save(seance);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}