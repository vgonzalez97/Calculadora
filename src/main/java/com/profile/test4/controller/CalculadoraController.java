package com.profile.test4.controller;

import com.profile.test4.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * The Class CalculadoraController.
 */

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @GetMapping(value = "/suma/{firstNumber}/{secondNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public BigDecimal Suma(@PathVariable(required = true) BigDecimal firstNumber, @PathVariable(required = true) BigDecimal secondNumber){
        return calculadoraService.suma(firstNumber,secondNumber);
    }

    @GetMapping(value = "/resta/{firstNumber}/{secondNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public BigDecimal Resta(@PathVariable(required = true) BigDecimal firstNumber, @PathVariable(required = true) BigDecimal secondNumber){
        return calculadoraService.resta(firstNumber,secondNumber);
    }
}
