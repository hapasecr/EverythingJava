package com.practice.theDailyByte;

/**
 * This question is asked by Microsoft. Given an array of strings, return the longest common prefix that is shared amongst all strings.
 * Note: you may assume all strings only contain lowercase alphabetical characters.
 *
 * Ex: Given the following arrays...
 *
 * ["colorado", "color", "cold"], return "col"
 * ["a", "b", "c"], return ""
 * ["spot", "spotty", "spotted"], return "spot"
 */
public class LongestCommonPrefix {

    public static void main(String[] args){
        String[] inputArray = new String[]{"colorado","color","cold"};

        StringBuilder sb = new StringBuilder();

        int maxLength = -1;

        for(String eachString:inputArray)
                maxLength = Math.max(maxLength,eachString.length());

        for(int i=0 ; i<maxLength ; i++){
            char c = inputArray[0].charAt(i);
            boolean flag = true;

            //7272851818

            for(String eachString:inputArray){
                if(i == eachString.length()-1 || eachString.charAt(i) != c)
                    flag = false;
                break;
            }

            if(flag)
                sb.append(c);
        }

        System.out.println("Output is : " + sb.toString());
    }
}
