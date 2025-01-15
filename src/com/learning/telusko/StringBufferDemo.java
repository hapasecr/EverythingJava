package com.learning.telusko;

public class StringBufferDemo {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Chaitanya");
        sb.append(" Hapase");
        System.out.println(sb.toString());                          // Chaitanya Hapase

        sb.insert(9, " Ramesh");
        System.out.println(sb.toString());                          // Chaitanya Ramesh Hapase

        System.out.println("Capacity of String Buffer is : " + sb.capacity());
        System.out.println("Length of String Buffer is : " + sb.length());
    }
}
