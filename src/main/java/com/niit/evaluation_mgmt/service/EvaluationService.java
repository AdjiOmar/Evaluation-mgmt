package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Evaluation;
import com.niit.evaluation_mgmt.repository.EvaluationRepository;

@Service
public class EvaluationService {
    private final EvaluationRepository repo;


    public EvaluationService(EvaluationRepository repo) {
        this.repo = repo;
    }

    public List<Evaluation> getAll() {
        return repo.findAll();
    }

    public Optional<Evaluation> getById(Long id) {
        return repo.findById(id);
    }

    public Evaluation create(Evaluation evaluation) {
        return repo.save(evaluation);
    }

    public Evaluation update(Evaluation evaluation) {
        return repo.save(evaluation);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}