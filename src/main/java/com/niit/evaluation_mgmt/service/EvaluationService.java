package com.niit.evaluation_mgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Evaluation;
import com.niit.evaluation_mgmt.model.Question;
import com.niit.evaluation_mgmt.repository.EvaluationRepository;
import com.niit.evaluation_mgmt.repository.QuestionRepository;

@Service
public class EvaluationService {
    private final EvaluationRepository repo;
    private final QuestionRepository qRepo;


    public EvaluationService(EvaluationRepository repo, QuestionRepository qRepo ) {
        this.repo = repo;
        this.qRepo = qRepo;
    }

    public List<Evaluation> getAll() {
        return repo.findAll();
    }

    public Evaluation getById(Long id) {
        return repo.getById(id);
    }

    public Evaluation create(Evaluation evaluation) {
        Evaluation e = repo.save(evaluation);
        for (Question question : e.getQuestions()) {
            question.setEvaluation(e);
        }
        qRepo.saveAll(e.getQuestions());

        return e;
    }

    public Evaluation update(Evaluation evaluation) {
        return repo.save(evaluation);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}