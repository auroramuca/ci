package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }

    @Test
    void add() {
        assertEquals(7,calculator.add(3,4));
        assertNotEquals(9, calculator.add(5,5));
    }
    @Test
    void subtract() {
        assertEquals(10,calculator.subtract(20,10));
        assertNotEquals(9, calculator.subtract(20,10));
    }
    @Test
    void multiply() {
        assertEquals(24,calculator.multiply(6,4));
        assertNotEquals(9, calculator.multiply(5,5));
    }
    @Test
    void divide() {
        assertEquals(8,calculator.divide(32,4));
        assertNotEquals(9, calculator.divide(32,4));
        assertThrows(DivideByZeroException.class, () -> calculator.divide(12, 0));
    }
}