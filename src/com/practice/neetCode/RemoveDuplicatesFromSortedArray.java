package com.practice.neetCode;

public class RemoveDuplicatesFromSortedArray {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

    public static void main(String args[]){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Output is : " + removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {

        int leftPointer, rightPointer;

        for(leftPointer = 1, rightPointer = 1; rightPointer<nums.length; rightPointer++){
            if(nums[rightPointer] != nums[rightPointer-1]){
                nums[leftPointer] = nums[rightPointer];
                leftPointer++;
            }
        }

        return leftPointer;
    }

}

