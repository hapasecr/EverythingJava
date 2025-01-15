package com.practice.neetCode;

import java.util.Stack;

class NewStack{
    Stack<Integer[]> newStack;

    public NewStack() {
        newStack = new Stack<Integer[]>();
    }

    public void push(int val) {

        if(newStack.size() == 0){
            newStack.push(new Integer[]{val,val});
        }else{
            if(val < newStack.peek()[1])
                newStack.push(new Integer[]{val,val});
            else
                newStack.push(new Integer[]{val,newStack.peek()[1]});
        }
    }

    public void pop() {
        if(!newStack.isEmpty())
            newStack.pop();
    }

    public int top() {
            return newStack.peek()[0];
    }

    public int getMin() {
         return newStack.peek()[1];
    }

}

public class minStack {
    public static void main(String[] args){

        NewStack m = new NewStack();
        m.push(5);
        System.out.println("Current Min Value : " + m.getMin());
        m.push(10);
        System.out.println("Current Min Value : " + m.getMin());
        m.push(2);
        System.out.println("Current Min Value : " + m.getMin());

    }
}
