package com.practice.neetCode;
public class ArraySum {
    public static void main(String[] args) {
        int[] sampleArray = {10,10,10,10,10};
        int totalSum = 0;

        for(int itr=0;itr< sampleArray.length;itr++){
            totalSum += sampleArray[itr];
        }
        System.out.println("Total is : " + totalSum);
    }
}
