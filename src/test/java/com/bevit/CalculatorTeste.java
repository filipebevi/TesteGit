package com.bevit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTeste {
    
    @Test
    public void TestarSoma(){
        Calculator c = new Calculator();
        double soma = c.somar(1, 2);
        assertEquals(3, soma, 0.01);
    }
}