package com.cookies.cookies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/errores")
public class ErroresController {
    
    @GetMapping("/auth-error")
    public String home() {
        return "authError";
    }
}
