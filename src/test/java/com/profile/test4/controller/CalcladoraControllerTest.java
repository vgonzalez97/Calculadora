package com.profile.test4.controller;

import com.profile.test4.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.parseMediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculadoraController.class)
public class CalcladoraControllerTest {

    @MockBean
    CalculadoraService calculadoraService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void suma() throws Exception {
        Integer firstNumber = 1;
        Integer secondNumber = 2;
        when(calculadoraService.suma(firstNumber,secondNumber)).thenReturn(3);
        mockMvc.perform(get("/calculadora/suma/1/2")
                .accept(parseMediaType("application/json")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is(3)));
    }

    @Test
    void resta() throws Exception {
        Integer firstNumber = 1;
        Integer secondNumber = 2;
        when(calculadoraService.resta(firstNumber,secondNumber)).thenReturn(-1);
        mockMvc.perform(get("/calculadora/resta/1/2")
                .accept(parseMediaType("application/json")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is(-1)));
    }
}