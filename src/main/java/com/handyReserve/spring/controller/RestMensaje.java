package com.handyReserve.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class RestMensaje {

    private String MENSAJE = "Success!";

    @GetMapping("/prueba")
    public String retornarMensaje(){
        return MENSAJE;
    }

}
