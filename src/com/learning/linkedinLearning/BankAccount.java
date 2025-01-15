package com.learning.linkedinLearning;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = Math.max(balance,0);
    }

    public double getBalance(){
        return balance;
    }

    public String getOwner(){
        return owner;
    }

    public void withdrawMoney(double amount){
        if(amount > this.balance){
            System.out.println("Insufficient balance.");
        }else{
            this.balance = this.balance - amount;
        }
        this.announceBalance();
    }

    public void depositMoney(double amount){
        this.balance += amount;
        this.announceBalance();
    }

    public void announceBalance(){
        System.out.println("Your current balance is : " + this.balance);
    }
}
