package com.cpifppiramide.Angel.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiRestControler {

    @GetMapping("/")
    public String saluda() {

        return "Hola amigos";

    }

}
