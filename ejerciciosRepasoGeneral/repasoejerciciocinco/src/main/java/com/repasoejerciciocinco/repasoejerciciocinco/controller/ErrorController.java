package com.repasoejerciciocinco.repasoejerciciocinco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/errors")
public class ErrorController {
    
    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "error";
    }
}
