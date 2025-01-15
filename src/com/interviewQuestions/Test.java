package com.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, 500));
        employeeList.add(new Employee(2, 1000));
        employeeList.add(new Employee(3, 1500));
        employeeList.add(new Employee(4, 2000));
        employeeList.add(new Employee(5, 2500));
        employeeList.add(new Employee(6, 3000));
        employeeList.add(new Employee(7, 3500));

        employeeList.stream()
                .sorted((e1, e2) -> (int)(e2.getSalary() - e1.getSalary()))
                .forEach(System.out::println);

    }
}
