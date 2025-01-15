package com.learning.linkedinLearning;

public class BankAccountMain {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Chaitanya Hapase",15000);
        account1.announceBalance();
        account1.withdrawMoney(3000);
        account1.depositMoney(8000);
        account1.announceBalance();
    }
}
