package com.practice.theDailyByte;

public class VaccumCleanerRoute {
    /**
     * This question is asked by Amazon. Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.
     *
     * Ex: Given the following strings...
     *
     * "LR", return true
     * "URURD", return false
     * "RUULLDRD", return true
     */
    public static void main(String[] args){
        String inputString = "RUULLDRD";

        int horizontalCounter = 0, verticalCounter = 0;
        char[] characters = inputString.toCharArray();

        for(char c:characters){
            if(c == 'U')
                verticalCounter++;
            else if(c == 'D')
                verticalCounter--;
            else if(c == 'R')
                horizontalCounter++;
            else
                horizontalCounter--;
        }

        if(horizontalCounter == 0 && verticalCounter == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
