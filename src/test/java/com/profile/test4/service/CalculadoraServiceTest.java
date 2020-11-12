package com.profile.test4.service;

import com.profile.test4.service.impl.CalculadoraServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculadoraServiceTest {

    @Autowired
    CalculadoraServiceImpl calculadoraService;

    @Test
    public void suma() {
        assertEquals(new Integer(3), calculadoraService.suma(new Integer(1), new Integer(2)));
    }

    @Test
    public void resta() {
        assertEquals(new Integer(-1), calculadoraService.resta(new Integer(1), new Integer(2)));
    }
}
