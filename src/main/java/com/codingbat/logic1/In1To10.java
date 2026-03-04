package com.codingbat.logic1;

public class In1To10 {
    public static boolean in1To10(int n, boolean outsideMode) {
        boolean inRange = n >= 1 && n <= 10;
        boolean notInRange = n <= 1 || n >= 10;
        return outsideMode ? notInRange : inRange;
    }
}
