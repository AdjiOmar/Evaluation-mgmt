package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.TypeEvaluation;
import com.niit.evaluation_mgmt.repository.TypeEvaluationRepository;

@Service
public class TypeEvaluationService {

    private final TypeEvaluationRepository repo;

    public TypeEvaluationService(TypeEvaluationRepository repo) {
        this.repo = repo;
    }


    public List<TypeEvaluation> getAll() {
        return repo.findAll();
    }

    public Optional<TypeEvaluation> getById(Long id) {
        return repo.findById(id);
    }

    public TypeEvaluation create(TypeEvaluation typeEvaluation) {
        return repo.save(typeEvaluation);
    }

    public TypeEvaluation update(TypeEvaluation typeEvaluation) {
        return repo.save(typeEvaluation);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
    
}