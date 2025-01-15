package com.learning.javaBrains.advancedJava.lambdas;

import java.util.function.*;

public class JDKFunctionalInterfacesExample {
    public static void main(String[] args) {

        // Functions
        Function<Integer, Integer> foo1 = x -> x*2;
        Function<Integer, String> foo2 = num -> "Value is " + num;

        // Consumers
        Consumer<String> foo3 = name -> System.out.println("Hello " + name);

        // Suppliers
        Supplier<Double> foo4 = () -> Math.random();

        // Predicates
        Predicate<Integer> isEven = num -> num % 2 == 0;
        // Can be also written as below -
        Function<Integer, Boolean> isEven2 = num -> num % 2 == 0;

        // Executing each of them -
        System.out.println( "foo1 : " + foo1.apply(5));
        System.out.println("foo2 : " + foo2.apply(5));
        foo3.accept("World");
        System.out.println("foo4 : " +foo4.get());
        System.out.println("isEven : " +isEven.test(4));
        System.out.println("isEven2 : " +isEven2.apply(5));

        // All the above Functional Interfaces are Unary in nature i.e. they accept a single input argument.
        // Below are the Binary Functional Interfaces for the same i.e. accepting two input arguments.

        BiFunction<Integer, Integer, Integer> biFoo1 = (a, b) -> a + b;

        BiConsumer<String, String> biFoo2 = (str1, str2) -> System.out.println(str1.concat(str2));

        //Supplier does not have a Bi function since Supplier is not Unary, it's a Nullary function. i.e. no input args.

        BiPredicate<String, String> isEqualsIgnoreCase = (str1, str2) -> str1.equalsIgnoreCase(str2);

        // Executing each of the above Bi Functional Lambdas

        System.out.println("bi Foo1 " + biFoo1.apply(5,4));
        biFoo2.accept("Hello", "World");
        System.out.println("isEqualsIgnoreCase : " + isEqualsIgnoreCase.test("Hello", "HELLO"));
    }
}
