package com.practice.neetCode;

public class MyLinkedList {
    ListNode head, tail;
    int size;

    public MyLinkedList(){
        size = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index){
        if(index < 0 || index >=size) return -1;

        ListNode current = head;
        if(index + 1 < size - index){
            for(int i=0; i < index + 1; ++i) current = current.next;
        }else{
            current = tail;
            for(int i=0; i < size - index ; ++i) current = current.prev;
        }
        return current.val;
    }

    public void addAtHead(int val){
        ListNode pred = head, succ = head.next;

        ++size;
        ListNode current = new ListNode(val);
        current.next = succ;
        pred.next = current;
        current.prev = pred;
        succ.prev = current;

    }

    public void addAtTail(int val){
        ListNode pred = tail.prev, succ = tail;

        ++size;
        ListNode current = new ListNode(val);
        pred.next = current;
        current.next = succ;
        current.prev = pred;
        succ.prev = current;
    }

    public void addAtIndex(int index, int val){
        if(index > size) return;

        if(index < 0) index=0;

        ListNode pred, succ;
        if(index+1 < size-index){
            pred = head;
            for(int i=0; i<index; i++) pred = pred.next;
            succ = pred.next;
        }else{
            succ = tail;
            for(int i=0; i<size-index; ++i) succ = succ.prev;
            pred = succ.prev;
        }

        ++size;
        ListNode current = new ListNode(val);
        pred.next = current;
        current.next = succ;
        current.prev = pred;
        succ.prev = current;
    }

    public void deleteAtIndex(int index){
        if(index > size) return;

        ListNode pred, succ;

        if(index+1 < size-index){
            pred = head;
            for(int i=0; i<index; i++) pred = pred.next;
            succ = pred.next.next;
        }else{
            succ = tail;
            for(int i=0; i<size-index-1; ++i) succ = succ.prev;
            pred = succ.prev.prev;
        }

        --size;
        pred.next = succ;
        succ.prev = pred;
    }
}
