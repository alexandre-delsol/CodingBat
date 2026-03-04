package com.codingbat.logic1;

public class Love6 {
    public static boolean love6(int a, int b) {
        int sum = a + b;
        int diff = Math.abs(a - b);
        return sum == 6 || diff == 6 || a == 6 || b == 6;
    }
}
