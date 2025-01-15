package com.practice.projectEuler;

/**
 * Problem 1 of Euler's Project.
 * Topic - Multiples of 3 & 5
 * Description - If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;

        while(counter < 1000){
            if((counter%3 == 0) || (counter%5 == 0)){
                sum += counter;
            }
            counter++;
        }
        System.out.println("Sum is  : " + sum);
    }
}
