package com.jherrera.JavaTest.util;

public class DateUtil {
    public static boolean isLoapYears(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
