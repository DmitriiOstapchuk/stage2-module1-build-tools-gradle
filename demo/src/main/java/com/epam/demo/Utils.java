package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        try {
            for (String oneString : args) {
                if (Double.parseDouble(oneString) <= 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}