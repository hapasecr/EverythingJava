package com.learning.javaBrains.youTube.unit1;

public class RunnableExample {
    public static void main(String args[]){

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        myThread.run();

        // In the above example, we spawned a thread by implementing the unimplemented method.
        // The same can be done using a Lambda function

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));

        myLambdaThread.run();
    }
}

/**
 * Another main advantage of Lambda Expression is backward compatibility
 *
 * In the above example, a very old interface Runnable, which has just one method (hence a functional interface)
 * can be used with a Lambda Expression.
 */