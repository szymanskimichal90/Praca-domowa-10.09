package Zadanie1;

import java.util.stream.IntStream;

public class Calculator {
    private int a;
    private int b;
    private int addResult;

    public int add(int a, int b) {
        int [] table = {a,b};

        return IntStream.of(table).sum();

    }
}
