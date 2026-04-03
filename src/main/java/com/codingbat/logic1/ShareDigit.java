package com.codingbat.logic1;

public class ShareDigit {
    public static boolean shareDigit(int a, int b) {
        return a / 10 == b % 10 || b / 10 == a % 10 || a % 10 == b % 10 || a / 10 == b / 10;
    }
}
