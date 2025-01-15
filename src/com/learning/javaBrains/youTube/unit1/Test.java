package com.learning.javaBrains.youTube.unit1;

public class Test {
    public static void main(String[] args){
        MyLambda myLambdaFunction = () -> System.out.println("Hello World!");
        MyAdd myAddFunction = (int a, int b) -> a + b;

        myLambdaFunction.foo();
        System.out.println(myAddFunction.foo(5,6));
    }

    interface MyLambda{
        void foo();
    }

    interface MyAdd{
        int foo(int x, int y);
    }
}

