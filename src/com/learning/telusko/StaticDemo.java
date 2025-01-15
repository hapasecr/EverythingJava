package com.learning.telusko;

class Mobile{
    String brand;
    int price;
    static String category;                                                 // Static Variable

    public void show(){
        System.out.println(brand + ":" + price + ":" + category);
    }

    public static void showStatic(Mobile obj){                              // Static Method
        System.out.println(obj.brand + ":" + obj.price + ":" + category);
    }
}

public class StaticDemo {
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 1500;
        Mobile.category = "Electronics";            //Static Reference

        m1.show();
        Mobile.showStatic(m1);                      //Static Reference

        Mobile m2 = new Mobile();
        m2.brand = "Samsung";
        m2.price = 1700;
        Mobile.category = "Electronics New";        //Static Reference

        m2.show();
        Mobile.showStatic(m2);                      //Static Reference
    }
}
