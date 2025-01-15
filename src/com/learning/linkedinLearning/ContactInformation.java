package com.learning.linkedinLearning;

public class ContactInformation {
    String name;
    long phoneNumber = 0L;
    String emailAddress = null;

    public ContactInformation(String name, long phoneNumber, String emailAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        announceContactDetails();
    }

    public ContactInformation(String name, long phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        announceContactDetails();
    }

    public ContactInformation(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        announceContactDetails();
    }

    public void announceContactDetails(){
        System.out.println("Name : " + name);
        if(phoneNumber == 0.0)
            System.out.println("Phone Number : Unknown");
        else
            System.out.println("Phone Number : " + phoneNumber);
        if(null == emailAddress)
            System.out.println("Email Address : Unknown");
        else
            System.out.println("Email Address : " + emailAddress);
    }
}
