package com.practice.neetCode;

import java.util.Stack;

class MyStack{

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MyStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        }else{
            stack.push(val);
            minStack.push(val<minStack.peek()?val:minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class minStack2 {

    public static void main(String[] args){

        MyStack m = new MyStack();
        m.push(5);
        System.out.println("Current Min Value : " + m.getMin());
        m.push(10);
        System.out.println("Current Min Value : " + m.getMin());
        m.push(2);
        System.out.println("Current Min Value : " + m.getMin());

    }

}
