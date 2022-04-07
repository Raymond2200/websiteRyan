package com.ryantepperstudios.application.controller;

import com.ryantepperstudios.application.controller.model.EmailRequestMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmailController {

    @Autowired
    EmailRequestMapperImpl emailServiceImpl;

    @Autowired
    EmailRequestMapperImpl emailRequestMapper;

    @PostMapping(value = "/email")
    public ResponseEntity<Void> sendEmailRequest(
            @RequestBody String name,
            @RequestBody String email,
            @RequestBody String notes) {
        EmailRequestRessource emailRequestRessource = new EmailRequestRessource(name, email, notes);

        esponseEntity<>()

    }

}
