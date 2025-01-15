package com.practice.theDailyByte;

public class StringReverse {

    public static void main(String[] args){
        String inputString = "civic";

        char[] characters = inputString.toCharArray();

        for(int i=0,j=characters.length-1 ; i<characters.length/2; i++,j--){
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }

        System.out.println("Input is : " + inputString);
        System.out.println("Output is : " + new String(characters));
    }

}
