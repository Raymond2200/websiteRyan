package com.ryantepperstudios.application.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequestRessource {

    private String name;
    private String email;
    private String message;
}
