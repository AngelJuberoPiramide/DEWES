package com.cpifppiramide.Angel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/index")
    String inicio(){
        return "index";
    }

}
