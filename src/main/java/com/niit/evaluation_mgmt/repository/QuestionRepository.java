package com.niit.evaluation_mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.evaluation_mgmt.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
    
}