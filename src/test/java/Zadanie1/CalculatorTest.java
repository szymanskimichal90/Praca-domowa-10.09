package Zadanie1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTest() {
        Calculator calcTest = new Calculator();
        assertEquals(calcTest.add(2, 5), 2 + 5);

    }

    @Test
    public void addTes1t() {
        Calculator calcTest = new Calculator();
        int a = 0;
        int b = 0;
        for (int i = 0; i == 2147483647; i++)
            a++;b++;

            assertEquals(calcTest.add(a, b), a + b);

    }
}