package com.niit.evaluation_mgmt.controller;

import java.util.List;
import java.util.Optional;
import com.niit.evaluation_mgmt.model.Question;
import com.niit.evaluation_mgmt.service.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin
@RequestMapping(value="/question")

public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }
@PostMapping
public Question create(@RequestBody Question question) {
   return service.create(question);
}

@GetMapping
public List<Question> getAll() {
    return service.getAll();
}

@GetMapping(value = "/{id}")
public Optional<Question> getById(@PathVariable Long id){
    return service.getById(id);
}

@PutMapping
public Question update(@RequestBody Question question) {
    return service.update(question);
}

@DeleteMapping(value="/{id}")
public void delete(@PathVariable Long id){
    service.delete(id);
}

} 