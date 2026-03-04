package com.codingbat.logic1;

public class AlarmClock {
    public static String alarmClock(int day, boolean vacation) {
        boolean weekday = day > 0 && day <= 5;
        if (!vacation) {
            return (weekday) ? "7:00" : "10:00";
        }
        return (weekday) ? "10:00" : "off";
    }
}
