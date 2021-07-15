package com.poo.avaliacao1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraDeFuncoesTest {

    @Test
    void funcaoA() {
        Calculadora calc = new Calculadora();
        CalculadoraDeFuncoes cf = new CalculadoraDeFuncoes();

        assertEquals(7, cf.funcaoA(2, 2, calc));
    }

}
