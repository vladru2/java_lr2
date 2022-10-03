package ru.rsatu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeLib {
    public static String getDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}