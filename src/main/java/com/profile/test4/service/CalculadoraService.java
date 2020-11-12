package com.profile.test4.service;


import java.math.BigDecimal;

public interface CalculadoraService {

	/**
	 * suma de los dos elementos
	 *
	 * @param firstNumber
	 * @param secondNumber
	 *
	 * @return suma de los dos números
	 */
	BigDecimal suma(BigDecimal firstNumber, BigDecimal secondNumber);

	/**
	 * resta de los dos elementos
	 *
	 * @param firstNumber
	 * @param secondNumber
	 *
	 * @return resta el segundo número al primero
	 */

	BigDecimal resta(BigDecimal firstNumber, BigDecimal secondNumber);
	

}
