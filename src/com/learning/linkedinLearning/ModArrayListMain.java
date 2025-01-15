package com.learning.linkedinLearning;

public class ModArrayListMain {
    public static void main(String[] args){
        ModArrayList<String> myArrayList = new ModArrayList<String>();
        myArrayList.add("Zero");
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        myArrayList.add("Four");
        myArrayList.add("Five");
        myArrayList.add("Six");

        System.out.println(myArrayList.getUsingMod(-16));
    }
}
