package com.cpifppiramide.Angel.controller;

import constructores.plato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlatoController {

    private List<plato> platos = new ArrayList<>();

    @GetMapping("/platos")
    public String mostrarPlatos(Model model) {
        model.addAttribute("platos", platos);
        return "platos";
    }

    @PostMapping("/platos/guardar")
    public String guardarPlato() {
        return "redirect:/platos";
    }
}