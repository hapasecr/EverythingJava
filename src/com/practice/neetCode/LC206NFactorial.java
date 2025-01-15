package com.practice.neetCode;

public class LC206NFactorial {
    public static void main(String[] args){
        int n = 5;
        int result = 1;

        while(n>1){
            result = result * (n);
            n--;
        }

        System.out.println("Factorial : " + result);
    }
}
