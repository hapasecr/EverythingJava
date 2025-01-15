package com.learning.telusko;

class A1{
    public void show(){
        System.out.println("In A Show");
    }
}

public class AnonymousInnerClass {
    public static void main(String args[]){

        A1 obj = new A1(){
            public void show(){
                System.out.println("In New Show");
            }
        };

        obj.show();
    }
}
