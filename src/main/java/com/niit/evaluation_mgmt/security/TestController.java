package com.niit.evaluation_mgmt.security;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/apprenant")
    @PreAuthorize("hasRole('APPRENANT') or hasRole('FORMATEUR') or hasRole('GESTIONNAIRE')")
    public String apprenantAccess() {
        return "Apprenant Content.";
    }

    @GetMapping("/formateur")
    @PreAuthorize("hasRole('FORMATEUR')")
    public String formateurAccess() {
        return "Formateur Board.";
    }

    @GetMapping("/gestionnaire")
    @PreAuthorize("hasRole('GESTIONNAIRE')")
    public String gestionnaireAccess() {
        return "Gestionnaire Board.";
    }
}