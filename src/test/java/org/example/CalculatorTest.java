package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(5, calc.add(2, 3), "2 + 3 = 5");
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        assertEquals(2, calc.subtract(5, 3), "5 - 3 = 2");
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertEquals(15, calc.multiply(5, 3), "5 * 3 = 15");
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(3, calc.divide(15, 5), "15 / 5 = 3");
    }
}