package com.learning.telusko;

class Parent{
    public static void staticMethod(){
        System.out.println("In Parent Static Method");
    }

    public void nonStaticMethod(){
        System.out.println("In Parent Non Static Method");
    }
}

class Child extends Parent{
    public static void staticMethod(){
        System.out.println("In Child Static Method");
    }

    public void nonStaticMethod(){
        System.out.println("In Child Non Static Method");
    }
}

public class StaticMethodOverriding {
    public static void main(String args[]){
        Parent parent = new Child();
        parent.staticMethod();
        parent.nonStaticMethod();

        System.out.println();

        Child child = new Child();
        child.staticMethod();
        child.nonStaticMethod();
    }
}
