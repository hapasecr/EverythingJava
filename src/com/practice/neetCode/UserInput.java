package com.practice.neetCode;

import java.util.*;

public class UserInput {
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args){

        HashSet<Integer> countMap = new HashSet<>();

        System.out.print("Enter your favourite number: ");

        if(inputScanner.hasNextInt()){
            int numberEntered = inputScanner.nextInt();
            System.out.print("You entered - " + numberEntered);
        }
    }
}

/**
 * 1. Used Doubly Linked List to track the usage order.
 * 2. L.next = Least Recently used Node (LRU)
 *     R.prev = Most Recently used Node (MRU)
 * 3. Used a HashMap to store the active key-value pairs in the Cache.
 * 4. Used two helper functions for the LinkedList
 *      - insert(Node): inserts the Node at the R end (Marking it MRU)
 *      - delete(Node): deletes the Node from the LinkedList
 *
 * See code comments for detailed logic
 */