package com.learning.linkedinLearning;

public class EmployeeMain {
    public static void main(String[] args){
        Employee emp1 = new Employee("Chaitanya Hapase",30,110000,"San Jose, California");
        Employee emp2 = new Employee("Rutuja Hapase",23,0,"Rockford, Illinois");

        emp2.raiseSalary(50000);

        emp1.announceSalary();
        emp2.announceSalary();
    }
}
