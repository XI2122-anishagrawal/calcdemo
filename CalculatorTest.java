package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class CalculatorTest {
	
	private Calculator calculator = new Calculator();
	private CalculatorMain val = new CalculatorMain();
	
	@BeforeEach
	public void setup() throws Exception {
		calculator = new Calculator();
	}
	
	@Test
	@DisplayName("multiply two positive numbers")
	public void multiplicationTest() {
	//	assertEquals(val.a*val.b ,calculator.multiplication(val.a,val.b),"This should be working");
	}
	
}
