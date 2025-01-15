package com.learning.telusko;

class InnerClassOuter{
    private int x = 98;

    class InnerClassInner{
        public void show(){
            System.out.println("Value of x inside Inner Class : " + x);
        }
    }
}

public class InnerClass {

    public static void main(String args[]){
        InnerClassOuter.InnerClassInner innerClassObject = new InnerClassOuter().new InnerClassInner();
        innerClassObject.show();
    }

}
