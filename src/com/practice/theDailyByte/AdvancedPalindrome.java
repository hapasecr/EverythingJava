package com.practice.theDailyByte;

public class AdvancedPalindrome {

    /**
     * This question is asked by Facebook. Given a string, return whether or not it forms a palindrome
     * ignoring case and non-alphabetical characters.
     *
     * Note: a palindrome is a sequence of characters that reads the same forwards and backwards.
     *
     * Ex: Given the following strings...
     *
     * "level", return true
     * "algorithm", return false
     * "A man, a plan, a canal: Panama.", return true
     *
     * @param args
     */

    public static void main(String[] args){
        String inputString = "A man, a plan, a canal: Panama.";
        String revisedString = null;

        char[] inputCharacters = inputString.toCharArray();
        char[] revisedCharacters = new char[inputCharacters.length];

        int j=0;

        for(int i=inputCharacters.length-1 ; i>=0 ; i--){
            if(Character.isAlphabetic(inputCharacters[i])){
                revisedCharacters[j] = inputCharacters[i];
                j++;
            }
        }

        revisedString = new String(revisedCharacters).trim();

        char[] characters = revisedString.toCharArray();

        for(int i=0,k=characters.length-1 ; i<characters.length/2; i++,k--){
            char temp = characters[i];
            characters[i] = characters[k];
            characters[k] = temp;
        }

        String reversedString = new String(characters);

//        System.out.println("Input String : " + inputString);
//        System.out.println("Revised String : " + revisedString);
//        System.out.println("Reversed String : " + reversedString);

        if (reversedString.equalsIgnoreCase(revisedString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
