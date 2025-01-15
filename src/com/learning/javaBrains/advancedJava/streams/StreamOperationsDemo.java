package com.learning.javaBrains.advancedJava.streams;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamOperationsDemo {
    public static void main(String[] args) {

        /**
         * Filter Operator filters the elements according to the function into a new stream
         * Limit Operator limits the number of elements going into the new stream
         */
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(x -> x%2 == 0)
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        /**
         * Map operator applies the function on each element and passes them into the new stream
         * PRO TIP : look at the order of the operators for increased performance
         */
        Stream.of("Apple", "Banana", "Strawberry", "Orange", "Dragonfruit")
                .limit(4)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        /**
         * Peek Operator to generate  side effects or for logging purposes
         */
        Stream.of("Apple", "Banana", "Strawberry", "Orange", "Dragonfruit")
                .map(String::toUpperCase)
                .peek(str -> System.out.println("Peeking at : " + str))
                .filter(str -> str.length() <6)
                .forEach(System.out::println);

        System.out.println();

        /**
         * Distinct and Sorted Operators (Both are intermediate operators)
         */
        Stream.of(1,9,2,3,4,4,5,6,7,8,9,10)
                .distinct()
                .peek(str -> System.out.println("Peeking at " + str))
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        /* Stream Concat */
        Stream<Integer> evenNumbers = Stream.of(2,4,6,8);
        Stream<Integer> oddNumbers = Stream.of(1,3,5,7);

        Stream.concat(evenNumbers,oddNumbers)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "B");

        hashMap.entrySet().stream()
                .filter(e -> e.getValue().equalsIgnoreCase("b"))
                .forEach(System.out::println);
    }
}
