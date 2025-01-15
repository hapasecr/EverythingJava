package com.learning.javaBrains.advancedJava.lambdas;

public class LambdaExpressionsExamples {
    public static void main(String[] args){

        MathOperation increment = x -> x+1;
        var result = increment.operation(5);

        System.out.println("Result : " + result);
    }
}

interface MathOperation{
    int operation(int x);
}
