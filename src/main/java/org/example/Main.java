package org.example;

public class Main {

    public static String fizzbuzz(int number) {
        if (isDividableBy(number, 3) && isDividableBy(number, 5)) {
            return "fizzbuzz";
        } else if (isDividableBy(number, 5)) {
            return "buzz";
        } else if (isDividableBy(number, 3)) {
            return "fizz";
        }
        return String.valueOf(number);
    }

    private static boolean isDividableBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
