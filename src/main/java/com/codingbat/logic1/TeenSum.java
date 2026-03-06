package com.codingbat.logic1;

public class TeenSum {
    private static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
    public static int teenSum(int a, int b) {
        int sum = a + b;
        return (isTeen(a) || isTeen(b)  ) ? 19 : sum;
    }

}
