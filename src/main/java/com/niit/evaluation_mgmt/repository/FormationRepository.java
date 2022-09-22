package com.niit.evaluation_mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.evaluation_mgmt.model.Formation;

@Repository 
public interface FormationRepository extends JpaRepository<Formation, Long>{
    
}