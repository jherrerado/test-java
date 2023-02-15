package com.jherrera.JavaTest.util;

public class StringUtil {
    public static boolean isEmpty(String str){
        if(str == null){
            str = "";
        }

        if(str.equals("")){
            return true;
        }

        return false;
    }
}
