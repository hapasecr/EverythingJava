package com.learning.javaBrains.advancedJava.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsGenerateDemo {
    public static void main(String[] args) {

        // Using the stream() API
        List<String> names = List.of("foo", "bar", "baz");
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);

        System.out.println();

        // Using an Array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(numbers)
                .forEach(System.out::print);

        System.out.println();

        // Using Stream.of
        Stream.of("Mangoes", "Bananas", "Apples")
                .forEach(System.out::println);

        System.out.println();

        // Using Stream.generate
        Stream.generate(new Random()::nextDouble)
                .limit(10)
                .forEach(System.out::println);

        System.out.println();

        // Using Stream.iterate
        Stream.iterate(0, x -> x+2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println();

        // Using Streams to iterate over files

        // Path path = Paths.get("README.md");
        // Stream<String> lines = Files.lines(path);

        // OR Simply
        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get("README.md"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lines.forEach(System.out::println);
    }
}
