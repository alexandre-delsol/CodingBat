package com.codingbat.logic1;

public class InOrderEqual {
    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }
}
