package com.interviewQuestions;

import java.util.Scanner;

public class Graphiant {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        String firstName = null;
        String lastName = null;
        String userName = null;
        String passwordEntered = null;

        Boolean flag = false;

        System.out.println("Enter your first name, Last name and username : ");

        if(inputScanner.hasNext()){
            firstName = inputScanner.next();
        }
        if(inputScanner.hasNext()){
            lastName = inputScanner.next();
        }
        if(inputScanner.hasNext()){
            userName = inputScanner.next();
        }

        System.out.println("Enter your password : ");

        if(inputScanner.hasNext()){
            passwordEntered = inputScanner.next();
        }

        if(passwordEntered.length() <8){
            flag = true;
        }else if(isSubstring(passwordEntered, firstName) || isSubstring(passwordEntered, lastName) || isSubstring(passwordEntered, userName)){
            flag = true;
        }else{
            if(!hasUpperCaseChar(passwordEntered) && !hasLowerCaseChar(passwordEntered) && !hasThreeDistinctChars(passwordEntered) && !hasADigit(passwordEntered) &&!hasASpecialChar(passwordEntered)){
                flag = true;
            }
        }

        if(flag){
            System.out.println("Password entered is Invalid.");
        }else{
            System.out.println("Login Successful.");
        }

    }

    public static Boolean hasADigit(String passwordEntered) {

        for (int i = 0; i < passwordEntered.length(); i++) {
            if (passwordEntered.charAt(i) > 0 && passwordEntered.charAt(i) <= 9) {
                return true;
            }
        }
        return false;
    }

    public static Boolean hasThreeDistinctChars(String passwordEntered){
            char[] distinctChars = new char[3];
            int counter = 0;

            distinctChars[0] = passwordEntered.charAt(0);

            for(int i=1; i<passwordEntered.length(); i++){
                if(passwordEntered.charAt(0) != distinctChars[counter]){
                    if(counter<2){
                        counter++;
                        distinctChars[counter] = passwordEntered.charAt(i);
                    }else{
                        return true;
                    }
                }
            }

            return false;
        }

    public static Boolean isSubstring(String string1, String string2){


        return false;
    }

    public static Boolean hasUpperCaseChar(String string1){


        return false;
    }

    public static Boolean hasLowerCaseChar(String string1){


        return false;
    }

    public static Boolean hasASpecialChar(String string1){


        return false;
    }
}
