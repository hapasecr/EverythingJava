package com.learning.javaBrains.youTube.unit2;

public class MethodReferenceExample1 {
    public static void main(String[] args){

        Thread t1 = new Thread(() -> printMessage());
        t1.start();

        //the above can be also written using MethodReference as :

        Thread t2 = new Thread(MethodReferenceExample1::printMessage);
        t2.start();
    }

    public static void printMessage(){
        System.out.println("Hello World!");
    }
}
