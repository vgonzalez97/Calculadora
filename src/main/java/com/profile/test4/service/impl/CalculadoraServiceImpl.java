package com.profile.test4.service.impl;

import com.profile.test4.service.CalculadoraService;
import org.springframework.stereotype.Service;


/**
 * Implementación del servicio CalculadoraService
 */
@Service("calculadoraService")
public class CalculadoraServiceImpl implements CalculadoraService {
	
	@Override
	public Integer suma(Integer firstNmuber, Integer secondNmuber) {
		Integer result = firstNmuber + secondNmuber;
		return result;
	}
}
