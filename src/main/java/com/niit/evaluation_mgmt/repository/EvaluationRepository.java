package com.niit.evaluation_mgmt.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.evaluation_mgmt.model.Evaluation;
//import com.niit.evaluation_mgmt.model.Module;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

//List<Evaluation> findByModule(Module module);

}