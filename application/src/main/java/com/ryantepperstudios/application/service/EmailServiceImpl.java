package com.ryantepperstudios.application.service;

import com.ryantepperstudios.application.model.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(EmailRequest emailRequest) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailRequest.getEmail());
        message.setTo("raycasgrain@gmail.com");
        message.setSubject(emailRequest.getName());
        message.setText(emailRequest.getMessage());
        emailSender.send(message);
    }
}
