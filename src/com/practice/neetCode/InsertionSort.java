package com.practice.neetCode;



public class InsertionSort {

    public static void main(String[] args){
        int[] inputArray = {4,2,5,3,6,1,0};
        printOutputArray(insertionSort(inputArray));

    }

private static int[] insertionSort(int[] inputArray){
        if(inputArray == null || inputArray.length == 0)
            return null;
        else {
            for(int i=1; i<inputArray.length; i++){
                int j = i-1;

                while(j>=0 && inputArray[j+1] < inputArray[j]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                    j--;
                }
            }
        }

        return inputArray;
    }

    private static void printOutputArray(int[] outputArray){
        System.out.println("OutputArray print : ");
        for(int eachInt:outputArray){
            System.out.print(eachInt + " ");
        }
        System.out.println();
    }


}

