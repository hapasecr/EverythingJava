package com.practice.neetCode;

public class QuickSort {

    public static void main(String[] args){
        int[] inputArray = new int[]{4,2,5,3,6,1,0};
        printOutputArray(quickSort(inputArray, 0, inputArray.length-1));
    }

    private static int[] quickSort(int[] nums, int s, int e){

        if(s < e){
            int left = s;
            int m = (e+s)/2;
            int pivot = nums[m];

            for(int i=s; i<m; i++){
                if(nums[i] < pivot){
                    int temp = nums[left];
                    nums[left] = nums[i];
                    nums[i] = temp;
                    left++;
                }
            }

            nums[m] = nums[left];
            nums[left] = pivot;

            quickSort(nums, s, left-1);
            quickSort(nums, left+1, e);
        }

        return nums;

    }

    private static void printOutputArray(int[] outputArray){
        System.out.println("OutputArray print : ");
        for(int eachInt:outputArray){
            System.out.print(eachInt + " ");
        }
        System.out.println();
    }
}
