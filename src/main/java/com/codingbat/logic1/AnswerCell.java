package com.codingbat.logic1;

public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMorning) return isMom;
        return true;
    }
}
