package com.learning.linkedinLearning;

public class Employee {
    String completeName;
    int age;
    int salary;
    String location;

    public Employee(String fullName, int age, int salary, String location){
        this.completeName = fullName;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public void raiseSalary(int salaryRaiseAmt){
        this.salary =+ salaryRaiseAmt;
    }

    public void announceSalary(){
        System.out.println("The current salary for " + this.completeName + " is " + this.salary);
    }
}
