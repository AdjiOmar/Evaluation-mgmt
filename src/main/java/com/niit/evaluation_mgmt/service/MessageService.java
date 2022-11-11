package com.niit.evaluation_mgmt.service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private JavaMailSender javaMailSender;

    public ResponseEntity<Void> sender(String a, String message, String de) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        helper.setTo(a);
        helper.setText(message);
        helper.setFrom(de);

        javaMailSender.send(mimeMessage);
        return null;
    }

}