package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.niit.evaluation_mgmt.model.Formateur;
import com.niit.evaluation_mgmt.repository.FormateurRepository;

@Service
public class FormateurService {

    private final FormateurRepository repo;


    public FormateurService(FormateurRepository repo) {
        this.repo = repo;
    }

    public List<Formateur> getAll() {
        return repo.findAll();
    }

    public Optional<Formateur> getById(Long id) {
        return repo.findById(id);
    }

    public Formateur create(Formateur formateur) {
        return repo.save(formateur);
    }

    public Formateur update(Formateur formateur) {
        return repo.save(formateur);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}