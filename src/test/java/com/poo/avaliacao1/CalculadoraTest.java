package com.poo.avaliacao1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    float nulo;

    double small = 0.5;

    @Test
    void adicao() {
        Calculadora calc = new Calculadora();

        assertEquals(2, calc.soma(1, 1));

        assertEquals(2, calc.soma(2, nulo));
    }

    @Test
    void subtracao() {
        Calculadora calc = new Calculadora();

        assertEquals(0, calc.subtracao(1, 1));

        assertEquals(2, calc.subtracao(2, nulo));

        assertEquals(-2, calc.subtracao(nulo, 2));

        assertEquals(2, calc.subtracao(nulo, -2));
    }

    @Test
    void divisao() {

        Calculadora calc = new Calculadora();

        assertEquals(4, calc.divisao(2, 0.5));
        assertTrue(Double.isInfinite(calc.divisao(0.5, 0)));
        assertTrue(Double.isInfinite(calc.divisao(2, 0)));
        assertTrue(Double.isNaN(calc.divisao(0, 0)));
        assertTrue(Double.isInfinite(calc.divisao(2, nulo)));
    }

}
