package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Utilisateur;
import com.niit.evaluation_mgmt.repository.UtilisateurRepository;

@Service
public class UtilisateurService {

    private final UtilisateurRepository repo;

    public UtilisateurService(UtilisateurRepository repo) {
        this.repo = repo;
    }
    public List<Utilisateur> getAll() {
        return repo.findAll();
    }

    public Optional<Utilisateur> getById(Long id) {
        return repo.findById(id);
    }

    public Utilisateur create(Utilisateur utilisateur) {
        return repo.save(utilisateur);
    }

    public Utilisateur update(Utilisateur utilisateur) {
        return repo.save(utilisateur);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}