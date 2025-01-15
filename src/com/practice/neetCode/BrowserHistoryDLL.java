package com.practice.neetCode;

class BrowserHistoryPage {
    String pageName;
    BrowserHistoryPage next;
    BrowserHistoryPage prev;

    public BrowserHistoryPage(String pageName) {
        this.pageName = pageName;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    BrowserHistoryPage head;
    BrowserHistoryPage tail;

    public BrowserHistory(String homepage) {
        head = new BrowserHistoryPage(homepage);
        tail = head;
    }

    public void visit(String url) {

        tail.next = new BrowserHistoryPage(url);
        tail.next.prev = tail;
        tail = tail.next;

        displayHistory();
    }

   public String back(int steps) {

        for(int i=0; i<steps; i++){
            if(tail.prev != null)
                tail = tail.prev;
            else
                break;
        }

        return tail.pageName;
    }

    public String forward(int steps) {
        for(int i=0; i<steps; i++){
            if(tail.next != null)
                tail = tail.next;
            else
                break;
        }

        return tail.pageName;
    }

    public void displayHistory(){
        BrowserHistoryPage parser = head;
        System.out.print("History :: ");
        while(parser != null){
            System.out.print(parser.pageName + " >> ");
            parser = parser.next;
        }
        System.out.println();
    }
}

public class BrowserHistoryDLL{
    public static void main(String[] args){
        BrowserHistory myHistory = new BrowserHistory("leetcode.com");
        myHistory.visit("google.com");
        myHistory.visit("instagram.com");
        myHistory.visit("facebook.com");
        myHistory.visit("neetcode.com");
        myHistory.visit("gmail.com");
        System.out.println(myHistory.back(1));
        System.out.println(myHistory.back(1));
        System.out.println(myHistory.back(1));
        System.out.println(myHistory.back(5));
        System.out.println(myHistory.forward(1));
        System.out.println(myHistory.forward(1));
        System.out.println(myHistory.forward(1));
        System.out.println(myHistory.forward(8));




    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */