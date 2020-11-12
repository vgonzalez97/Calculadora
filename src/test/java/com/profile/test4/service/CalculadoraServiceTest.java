package com.profile.test4.service;

import com.profile.test4.service.impl.CalculadoraServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculadoraServiceTest {

    @Autowired
    CalculadoraServiceImpl calculadoraService;

    @Test
    public void suma() {
        assertEquals(new BigDecimal(3), calculadoraService.suma(new BigDecimal(1), new BigDecimal(2)));
    }

    @Test
    public void resta() {
        assertEquals(new BigDecimal(-1), calculadoraService.resta(new BigDecimal(1), new BigDecimal(2)));
    }
}
