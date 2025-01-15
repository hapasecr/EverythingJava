package com.practice.theDailyByte;

/**
 * This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
 * Note: neither binary string will contain leading 0s unless the string itself is 0
 *
 * Ex: Given the following binary strings...
 *
 * "100" + "1", return "101"
 * "11" + "1", return "100"
 * "1" + "0", return  "1"
 */
public class BinaryAdd {
    public static void main(String[] args){
        String inputString1 = "110";
        String inputString2 = "1";

        System.out.println(inputString1);
        System.out.println("+");
        System.out.println(inputString2);
        System.out.println("=");
        System.out.println(binaryAdd(inputString1,inputString2));
    }

    private static String binaryAdd(String inputString1, String inputString2){

        boolean carry = false;
        StringBuilder sb = new StringBuilder();

        int i = inputString1.length()-1;
        int j = inputString2.length()-1;

        while(i >= 0 || j >= 0 || carry){
            int countsOfOne = 0;

            if(i >= 0 && inputString1.charAt(i) == '1')
                countsOfOne++;
            if(j >= 0 && inputString2.charAt(j) == '1')
                countsOfOne++;
            if(carry)
                countsOfOne++;

            if(countsOfOne == 0){
                sb.append(0);
            } else if (countsOfOne == 1) {
                sb.append(1);
                if(carry)
                    carry = false;
            } else if (countsOfOne == 2) {
                sb.append(0);
                carry = true;
            }else if (countsOfOne == 3){
                sb.append(1);
                carry = true;
            }

            i--;
            j--;
        }


        return sb.reverse().toString();
    }
}
