package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Groupe;
import com.niit.evaluation_mgmt.repository.GroupeRepository;

@Service
public class GroupeService {

    private final GroupeRepository repo;

    public GroupeService(GroupeRepository repo) {
        this.repo = repo;
    }
    public List<Groupe> getAll() {
        return repo.findAll();
    }

    public Optional<Groupe> getById(Long id) {
        return repo.findById(id);
    }

    public Groupe create(Groupe groupe) {
        return repo.save(groupe);
    }

    public Groupe update(Groupe groupe) {
        return repo.save(groupe);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}