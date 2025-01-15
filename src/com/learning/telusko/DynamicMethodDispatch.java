package com.learning.telusko;

class A {
    public void show(){
        System.out.println("In class A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In class B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In class C");
    }
}

/**
 * Dynamic Dispatch Method is when the Super Class Object is pointed towards the
 * sub-class instance thus achieving run-time polymorphism or run-time method overriding.
 */
public class DynamicMethodDispatch {
    public static void main(String args[]){
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
