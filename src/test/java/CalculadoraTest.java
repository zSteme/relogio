package com.horarioweb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 3);
        Assertions.assertEquals(5, resultado);
    }

    @Test
    public void testSubtrair() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(5, 3);
        Assertions.assertEquals(2, resultado);
    }
}

