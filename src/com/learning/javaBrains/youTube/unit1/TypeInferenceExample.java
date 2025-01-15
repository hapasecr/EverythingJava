package com.learning.javaBrains.youTube.unit1;

public class TypeInferenceExample {
    public static void main(String[] args){
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello World!"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}

/**
 * In the above example, the compiler infers parameter type, return type, etc
 * based on the method signature in the target functional  interface.
 *
 * static method printLambda takes in a behaviour of the interface StringLengthLambda.
 * This functional interface is linked to a lambda function written in the main()
 * The l.getLength call in the static method infers the types of parameters,
 * the return type from the method signature declared in the interface, as well as,
 * the implementation for the same from the lambda function which is passed.
 */