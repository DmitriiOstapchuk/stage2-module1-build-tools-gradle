package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try { if (Double.parseDouble(str) > 0) {
            return true;
        } else {
            return false;
        } } catch (Exception e) {
            return false;
        }
    }
}
