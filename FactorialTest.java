package org.example;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test(expected = Exception.class)
    public void negativeFactorial() throws Exception {
        Factorial.calculateFactorial(-1410);
    }

    @Test (expected = Exception.class)
    public void rowOfNegativeFactorials() throws Exception {
        Factorial.getRowOfFactorials(-120);
    }

    @Test
    public void zeroFactorial() throws Exception {
        assertEquals(Factorial.calculateFactorial(0), BigInteger.ONE);
    }

    @Test
    public void factorialOfFive() throws Exception {
        assertEquals(Factorial.calculateFactorial(5), BigInteger.valueOf(120));
    }

    @Test
    public void factorialOfSix() throws Exception {
        assertEquals(Factorial.calculateFactorial(6), BigInteger.valueOf(720));
    }

    @Test
    public void factorialOfFirstSixNumbers() throws Exception {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>(
                Arrays.asList(
                        BigInteger.ONE,
                        BigInteger.ONE,
                        BigInteger.valueOf(2),
                        BigInteger.valueOf(6),
                        BigInteger.valueOf(24),
                        BigInteger.valueOf(120)
                )
        );
        List<BigInteger> result = Factorial.getRowOfFactorials(6);

        assertEquals(6, result.size());
        assertEquals(list, Factorial.getRowOfFactorials(6));
    }
}