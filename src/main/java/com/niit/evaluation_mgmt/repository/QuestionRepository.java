package com.niit.evaluation_mgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.evaluation_mgmt.model.Evaluation;
import com.niit.evaluation_mgmt.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    List<Question> findByEvaluation(Evaluation evaluation);

}