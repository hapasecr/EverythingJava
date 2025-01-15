package com.practice.neetCode;

public class LC206NFactorialRecursive {
    public static void main(String[] args){
        int n = 5;
        System.out.println(recursiveFunc(n));
    }

    public static int recursiveFunc(int n){
        if(n<=1){
            return 1;
        }else{
            return n * (recursiveFunc(n-1));
        }
    }
}
