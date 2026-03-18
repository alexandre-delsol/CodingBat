package com.codingbat.logic1;

public class TwoAsOne {
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

}
