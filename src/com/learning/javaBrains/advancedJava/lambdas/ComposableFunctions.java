package com.learning.javaBrains.advancedJava.lambdas;

import java.util.function.Function;

public class ComposableFunctions {
    public static void main(String[] args) {

        /**
         * andThen Example - Suppose we want to trim a string
         * from the trail end
         * as well as the lead end
         * and convert it to an uppercase
         * we have 3 different lambdas for the above ops
         *
         * Ofcourse we can do this directly using trim() and toUpperCase() but for the sake of the example
         */

        Function<String, String> trimLeading = String::stripLeading;
        Function<String, String> trimTrailing = String::stripTrailing;
        Function<String, String> toUpperCase = String::toUpperCase;

        String name = "   asdyuvaeurytv   ";

        String processedString = trimLeading
                .andThen(trimTrailing)
                .andThen(toUpperCase)
                .apply(name);

        // The above Lambdas can also be replaced by Method References as shown below -

        String processedString2 = toUpperCase
                .andThen(String::stripLeading)
                .andThen(String::stripTrailing)
                .apply(name);

        System.out.println(processedString2);

        /**
         * compose Example -
         * Exact opposite of andThen
         * f.compose(g).apply(x); == f(g(x));
         *
         * Math Ops Example - We want to divide the number by 2 and add 1 to it
         */

        int a = 50;

        Function<Integer, Integer> increment = x -> x+1;
        Function<Integer, Integer> divideBy2 = x -> x/2;

        Function<Integer, Integer> divideBy2ThenIncrement = increment.compose(divideBy2);

        System.out.println(divideBy2ThenIncrement.apply(a));    // 50/2 + 1 = 26;
    }
}
