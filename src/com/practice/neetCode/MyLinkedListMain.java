package com.practice.neetCode;

public class MyLinkedListMain {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(2);
        displayList(myLinkedList);
        myLinkedList.deleteAtIndex(1);
        displayList(myLinkedList);
        myLinkedList.addAtHead(2);
        displayList(myLinkedList);
        myLinkedList.addAtHead(7);
        displayList(myLinkedList);
        myLinkedList.addAtHead(3);
        displayList(myLinkedList);
        myLinkedList.addAtHead(2);
        displayList(myLinkedList);
        myLinkedList.addAtHead(5);
        displayList(myLinkedList);
        myLinkedList.addAtTail(5);
        displayList(myLinkedList);
        System.out.print("\nGet at 5 - " + myLinkedList.get(5));
        myLinkedList.deleteAtIndex(6);
        displayList(myLinkedList);
        myLinkedList.deleteAtIndex(4);
        displayList(myLinkedList);

        MyLinkedList[] lists = new MyLinkedList[]{};
    }

    public static void displayList(MyLinkedList myList){
        System.out.println();
        for(int i=0; i<myList.size; i++){
            System.out.print(myList.get(i) + " ");
        }
    }
}
