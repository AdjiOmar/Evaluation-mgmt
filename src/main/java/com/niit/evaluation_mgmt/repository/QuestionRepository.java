package com.niit.evaluation_mgmt.repository;

import com.niit.evaluation_mgmt.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.evaluation_mgmt.model.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
    List<Question> findByEvaluation(Evaluation evaluation);

}