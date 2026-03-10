package com.codingbat.logic1;

public class FizzString {
    public static String fizzString(String str) {
        if (str.isEmpty()) return str;

        boolean startsF = str.charAt(0) == 'f';
        boolean endsB = str.charAt(str.length()-1) == 'b';

        if (startsF && endsB) return "FizzBuzz";
        if (startsF) return "Fizz";
        if (endsB) return "Buzz";

        return str;
    }
}
