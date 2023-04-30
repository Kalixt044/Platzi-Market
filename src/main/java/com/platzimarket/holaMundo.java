package com.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
        @RequestMapping("/saludar")
public class holaMundo {
    @GetMapping("Hi")
    public String saludar(){
        return "Nunca pares de aprender we are the best one, Klt044";
    }
}
