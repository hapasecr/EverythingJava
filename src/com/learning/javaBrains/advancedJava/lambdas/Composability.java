package com.learning.javaBrains.advancedJava.lambdas;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Composability {
    public static void main(String[] args) {

        // Lambda to log the current Date Time with the String parameter

        Consumer<String> logMessage = msg -> System.out.println(msg + "; " + LocalDateTime.now());

        // Lambdas to call a generic lambda for logging

        Runnable logStart = () -> logMessage.accept("Start");
        Runnable logEnd = () -> logMessage.accept("End");

        /**
         * Lambda Definition for accepting a Lambda with an input parameter.
         * Calling Lambda for Logging Start time
         * Calling Lambda for the Operation to be performed
         * Calling Lambda for Logging End time
          */

        BiConsumer<UnaryOperator<Integer>, Integer> logger = (operation, number) -> {
            logStart.run();
            System.out.println(operation.apply(number));
            logEnd.run();
        };

        // Lambda which accepts a Lambda and an input param

        logger.accept(x -> x+1, 10);
        logger.accept(x -> x*100, 24);
    }
}
