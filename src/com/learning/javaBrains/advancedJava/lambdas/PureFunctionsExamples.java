package com.learning.javaBrains.advancedJava.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PureFunctionsExamples {
    public static void main(String[] args) {

        // Pure Function
        Function<Integer, Integer> foo = x -> x+1;

        // Pure Function
        BiFunction<String, String, Integer> bar = (str1, str2) -> str1.length() + str2.length();

        // Impure Function
        int count = 0;
        BiFunction<Integer, Integer, Integer> zoo = (num1, num2) -> num1 + num2 + count;

    }
}
