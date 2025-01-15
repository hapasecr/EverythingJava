package com.practice.neetCode;

public class MergeSort {
    public static void main(String[] args){

        int[] inputArray = new int[]{4, 2, 5, 3, 6, 1, 0};
        printOutputArray(mergeSort(inputArray,0,inputArray.length-1));
    }

    private static int[] mergeSort(int[] inputArray, int l, int r){
        if(l<r){
            int m = (r + l) / 2;

            mergeSort(inputArray, l, m);
            mergeSort(inputArray, m+1, r);
            mergeSubArrays(inputArray, l, m, r);
        }

        return inputArray;
    }

    private static void mergeSubArrays(int[] inputArray, int l, int m, int r){

        int length1 = m - l +1;
        int length2 = r - m;

        int[] L = new int[length1];
        int[] R = new int[length2];

        for(int i=0; i<length1; i++){
            L[i] = inputArray[i+l];
        }

        for(int j=0; j<length2; j++){
            R[j] = inputArray[m+j+1];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<length1 && j<length2){
            if(L[i] <= R[j]){
                inputArray[k] = L[i];
                i++;
            }else{
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<length1){
            inputArray[k] = L[i];
            i++;
            k++;
        }

        while(j<length2){
            inputArray[k] = R[j];
            j++;
            k++;
        }
    }

    private static void printOutputArray(int[] outputArray){
        System.out.println("OutputArray print : ");
        for(int eachInt:outputArray){
            System.out.print(eachInt + " ");
        }
        System.out.println();
    }
}
