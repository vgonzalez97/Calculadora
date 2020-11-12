package com.profile.test4.service.impl;

import com.profile.test4.service.CalculadoraService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * Implementación servicio CalculadoraService
 */
@Service("calculadoraService")
public class CalculadoraServiceImpl implements CalculadoraService {
	
	@Override
	public BigDecimal suma(BigDecimal firstNmuber, BigDecimal secondNmuber) {
		BigDecimal result = firstNmuber.add(secondNmuber);
		return result;
	}

	@Override
	public BigDecimal resta(BigDecimal firstNmuber, BigDecimal secondNmuber) {
		BigDecimal result = firstNmuber.subtract(secondNmuber);
		return result;
	}
}
