package com.profile.test4.service.impl;

import com.profile.test4.service.CalculadoraService;
import com.profile.test4.service.TracerAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


/**
 * Implementación servicio CalculadoraService
 */
@Service("calculadoraService")
public class CalculadoraServiceImpl implements CalculadoraService {

	@Autowired
	private TracerAPI tracerAPI;
	
	@Override
	public BigDecimal suma(BigDecimal firstNmuber, BigDecimal secondNmuber) {
		BigDecimal result = firstNmuber.add(secondNmuber);
		tracerAPI.trace("Se suman los numeros " + firstNmuber + " + " + secondNmuber);
		return result;
	}

	@Override
	public BigDecimal resta(BigDecimal firstNmuber, BigDecimal secondNmuber) {
		BigDecimal result = firstNmuber.subtract(secondNmuber);
		tracerAPI.trace("Se restan los numeros " + firstNmuber + " - " + secondNmuber);
		return result;
	}
}
