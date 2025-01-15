package com.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class ICE {
    public static void main(String[] args){

        int[] myArray = new int[]{1,3,5,7,9};
        int target = 8;

        int length = myArray.length;

        // Brute Force
        for(int i=0; i<length-1; i++){
            for (int j=i+1; j<length; j++){
                if(myArray[i] + myArray[j] == target)
                    System.out.println("Pair : " + i + " " + j);
            }
        }

        // Optimized
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<length; i++){
            if(map.containsKey(myArray[i]))
                System.out.println("Pair : " + i + " " + map.get(myArray[i]));
            else
                map.put((target-myArray[i]),i);
        }
    }
}
