package com.niit.evaluation_mgmt.service;

import java.util.List;
import java.util.Optional;

import com.niit.evaluation_mgmt.model.Evaluation;
import org.springframework.stereotype.Service;

import com.niit.evaluation_mgmt.model.Question;
import com.niit.evaluation_mgmt.repository.QuestionRepository;

@Service
public class QuestionService {

    private final QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }
public List<Question> getAll() {
    return repo.findAll();
}   
public Optional<Question> getById(Long id){
    return repo.findById(id);
}
public Question create(Question question){
    return repo.save(question);
}
public Question update(Question question){
    return repo.save(question);
}
public void delete(Long id){
     repo.deleteById(id);
}

public List<Question> getQuestionsOfEvaluation(Evaluation evaluation){
        return repo.findByEvaluation(evaluation);
}

}