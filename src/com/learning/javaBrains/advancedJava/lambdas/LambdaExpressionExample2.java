package com.learning.javaBrains.advancedJava.lambdas;

public class LambdaExpressionExample2 {
    public static void main(String[] args) {

        IntOperation addition = (x,y) -> x+y;
        IntOperation subtraction = (x,y) -> x-y;

        System.out.println("Addition : " + doMathOperation(addition,10,20));
        System.out.println("Subtraction : " + doMathOperation(subtraction,30,20));
    }

    public static int doMathOperation(IntOperation operation, int a, int b){
        return operation.doOperation(a,b);
    }
}

@FunctionalInterface
interface IntOperation{
    int doOperation(int i, int j);
}