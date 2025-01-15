package com.practice.neetCode;

import java.util.Stack;

public class LC682Solution {
    public static void main(String args[]){
        String[] operations = {"5","-2","4","C","D","9","+","+"};
        Stack<Integer> stack = new Stack<>();

        int temp1 = 0, temp2 = 0, sum = 0, finalScore = 0;
        stack.push(Integer.parseInt(operations[0]));

        for(int i=1; i<operations.length; i++){
            if(Character.isDigit(operations[i].charAt(0))){
                stack.push(Integer.parseInt(operations[i]));

            } else if (operations[i] == "+"){
                temp2 = stack.pop();
                temp1 = stack.pop();
                sum = temp1 + temp2;
                stack.push(temp1);
                stack.push(temp2);
                stack.push(sum);

            }else if(operations[i] == "D"){
                stack.push(stack.peek()*2);

            }else if(operations[i] == "C"){
                stack.pop();
            }
        }

        for(int i=stack.size(); i>0; i--){
            finalScore += stack.pop();
        }
        System.out.println(finalScore);
    }
}
