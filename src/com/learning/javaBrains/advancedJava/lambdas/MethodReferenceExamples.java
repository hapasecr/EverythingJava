package com.learning.javaBrains.advancedJava.lambdas;

import java.util.function.*;

public class MethodReferenceExamples {
    public static void main(String[] args) {

        // Example 1
        Supplier<Double> foo1 = () -> Math.random();
        Supplier<Double> foo2 = Math::random;

        // Example 2
        Consumer<String> printName = name -> System.out.println(name);
        Consumer<String> printName2 = System.out::println;

        // Example 3
        UnaryOperator<String> trim = str -> str.trim();
        UnaryOperator<String> trim2 = String::trim;

        // Example 4
        BiPredicate<String, String> isCaseInsensitiveEqual = (a, b) -> a.equalsIgnoreCase(b);
        BiPredicate<String, String> isCaseInsensitiveEqual2 = String::equalsIgnoreCase;

        System.out.println("foo1 : " + foo1.get() * 100);
        System.out.println("foo2 : " + foo2.get() * 100);
        System.out.println();
        printName.accept("Chaitanya");
        printName2.accept("Hapase");
        System.out.println();
        System.out.println("Equals : " + isCaseInsensitiveEqual.test("Foo","foo"));
        System.out.println("Equals2 : " + isCaseInsensitiveEqual2.test("Foo","foo"));
    }
}
