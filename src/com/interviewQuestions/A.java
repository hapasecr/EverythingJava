package com.interviewQuestions;

class Aa {
    public void method1(){

    }
}

class B extends Aa{
    public void method1(int i){

    }

}

public class A{
    public static void main(String[] args){
        B myObj = new B();
        myObj.method1();
    }
}