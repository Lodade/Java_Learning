package com.Lodade.app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.Lodade.junitlearning.Calculator;

import org.junit.jupiter.api.Test;

public class TestCalculatorClass {
    private final Calculator calc = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(2, calc.add(1,1), 0D);
        assertEquals(20000000, calc.add(10000000,10000000), 0D);
        assertEquals(200.967, calc.add(200.9, 0.067), 0D);
        assertEquals(100.31456, calc.add(100, 0.31456), 0D);
    }

    @Test
    public void testMultiply(){
        assertEquals(71849.82, calc.multiply(369.75, 194.32), 0.01D);
    }

    @Test
    public void testTurnAbsolute(){
        assertEquals(25.0, calc.turnAbsolute(-25.0), 0D);
        assertEquals(223478234.0 , calc.turnAbsolute(-223478234.0), 0D);
    }

    @Test
    public void testIsMultiple(){
        assertTrue(calc.isMultiple(15, 5));
        assertTrue(calc.isMultiple(27, 3));
    }
}
