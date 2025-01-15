package com.practice.neetCode;

public class LC1929Solution {
    public static void main(String args[]){
        int[] nums = {1,2,1};
        int[] twiceNums = new int[nums.length*2];
        int originalLen = nums.length;

        for(int i=0; i<originalLen; i++){
            twiceNums[i] = nums[i];
            twiceNums[i+originalLen] = nums[i];
        }

        for (int i:twiceNums
             ) {
            System.out.print(" " + i);
        }

    }
}
