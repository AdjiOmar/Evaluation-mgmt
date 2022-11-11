package com.niit.evaluation_mgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Evaluation;
//import com.niit.evaluation_mgmt.model.Module;
import com.niit.evaluation_mgmt.model.Question;
import com.niit.evaluation_mgmt.repository.EvaluationRepository;
// import com.niit.evaluation_mgmt.repository.ModuleRepository;
import com.niit.evaluation_mgmt.repository.QuestionRepository;

@Service
public class EvaluationService {
    private final EvaluationRepository repo;
    private final QuestionRepository qRepo;
    // private final ModuleRepository moduleRepository;

    public EvaluationService(EvaluationRepository repo, QuestionRepository qRepo){
    // , ModuleRepository moduleRepository) {
        this.repo = repo;
        this.qRepo = qRepo;
        // this.moduleRepository = moduleRepository;
    }

    public List<Evaluation> getAll() {
        return repo.findAll();
    }

    // public List<Evaluation> findByModule(Long id) {
    //     Module module = moduleRepository.findById(id).get();
    //     System.out.println(module.getEvaluations());
    //     return module.getEvaluations();
    // }

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

    // public List<Evaluation> findByEvaluation(Module module) {
    //     return repo.findByModule(module);
    // }
}