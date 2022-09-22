package com.niit.evaluation_mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niit.evaluation_mgmt.model.Gestionnaire;

@Repository
public interface GestionnaireRepository extends JpaRepository<Gestionnaire, Long>{
    
}