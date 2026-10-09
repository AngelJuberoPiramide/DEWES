package com.cpifppiramide.Angel.controller;

import constructores.TipoPlato;
import constructores.plato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlatoController {

    public static List<plato> platos = new ArrayList<>();

    @GetMapping("/platos")
    public String mostrarPlatos(Model model) {
        model.addAttribute("platos", platos);
        return "platos";
    }

    @PostMapping("/platos/guardar")
    public String guardarPlato(
            @RequestParam String nombre,
            @RequestParam double precio,
            @RequestParam String tipo) {

        int id = platos.size() + 1;

        plato nuevoPlato = new plato(id, nombre, precio, TipoPlato.valueOf(tipo));

        platos.add(nuevoPlato);

        return "redirect:/platos";
    }
}