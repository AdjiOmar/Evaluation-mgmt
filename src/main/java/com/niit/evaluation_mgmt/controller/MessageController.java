package com.niit.evaluation_mgmt.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.evaluation_mgmt.model.Message;
import com.niit.evaluation_mgmt.service.MessageService;

@RestController
@CrossOrigin
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> sender(
            @RequestBody Message message) throws MessagingException {
        return service.sender(message.getDe(), message.getMessage(), message.getA());
    }

}