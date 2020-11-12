package com.profile.test4.controller;

import com.profile.test4.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @GetMapping(value = "/suma", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer Suma(@RequestParam Integer firstNumber, @RequestParam Integer secondNumber){
        return calculadoraService.suma(firstNumber,secondNumber);
    }

    @GetMapping(value = "/resta", produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer Resta(@RequestParam Integer firstNumber, @RequestParam Integer secondNumber){
        return calculadoraService.resta(firstNumber,secondNumber);
    }
}
