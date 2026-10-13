
package com.cpifppiramide.Angel.controller;

import constructores.plato;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String mostrarMenu(
            @RequestParam(defaultValue = "") String ingrediente,
            Model model) {
        List<plato> platosFiltrados = new ArrayList<>();
        if (ingrediente.trim().isEmpty()) {
            platosFiltrados = PlatoController.platos;
        } else {
            for (plato p : PlatoController.platos) {
                for (String i : p.getIngredientes()) {
                    if (i.equalsIgnoreCase(ingrediente.trim())) {
                        platosFiltrados.add(p);
                        break;
                    }
                }
            }
        }
        model.addAttribute("platos", platosFiltrados);
        model.addAttribute("ingrediente", ingrediente);
        return "menu";
    }
}
