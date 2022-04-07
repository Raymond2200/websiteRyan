package com.ryantepperstudios.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequest {

    private String name;
    private String email;
    private String message;
}
