package com.practice.theDailyByte;

public class CorrectCapitalization {
    /**
     * This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.
     *
     * Ex: Given the following strings...
     *
     * "USA", return true
     * "Calvin", return true
     * "compUter", return false
     * "coding", return true
     *
     * @param args
     */
    public static void main(String[] args){
        String inputString = "coding";

        boolean flag = true;

        if(Character.isUpperCase(inputString.charAt(0))){
            if(Character.isUpperCase(inputString.charAt(1))){
                for(int i=2; i<inputString.length(); i++){
                    if(Character.isLowerCase(inputString.charAt(i))) {
                        flag = false;
                        break;
                    }
                }
            }else{
                for(int i=1; i<inputString.length(); i++){
                    if(Character.isUpperCase(inputString.charAt(i))) {
                        flag = false;
                        break;
                    }
                }
            }
        }else{
            for(char c : inputString.toCharArray()){
                if(Character.isUpperCase(c)){
                    flag = false;
                    break;
                }
            }
        }

        System.out.println(inputString + ":" + flag);
    }
}
