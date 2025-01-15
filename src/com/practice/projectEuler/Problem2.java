package com.practice.projectEuler;

/**
 * Problem 2 of Euler's Project.
 * Topic - Even Fibonacci numbers
 * Description - Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

public class Problem2 {
    public static void main(String[] args) {
        int int1 =1 , int2 = 2, sum = 0, swap = 0;

       // System.out.print(int1 + " ");

        while(int2 <= 4000000){

        //    System.out.print(int2 + " ");

            if(int2 % 2 == 0){
                sum += int2;
            }

            swap = int2;
            int2 += int1;
            int1 = swap;
        }
        System.out.println("The sum is : " + sum);
    }
}
