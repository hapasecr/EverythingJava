package com.practice.neetCode;

public class LC509FibonacciNumberRecursive {
    public static void main(String[] args){
        System.out.println("Fibonacci Number for n : 5 is " + recursiveFunc(7));
    }

    private static int recursiveFunc(int n){
        if(n <=1){
            return n;
        }else{
            return recursiveFunc(n-1) + recursiveFunc(n-2);
        }
    }
}
