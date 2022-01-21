package com.uppercase.util;

public class UppercaseUtil {
    public static String transform(String input) {
        String output = null;

        try {
            output = input.toUpperCase();
        } catch (NullPointerException nullPointerException) {
            System.out.print("Error in Uppercase Util transform(). ");
            System.out.println("Null Pointer Exception: Ensure the input is not null.");
        } catch (Exception e) {
            System.out.println("Error in Uppercase Util transform().");
        }

        return output;
    }
}
