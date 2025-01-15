package com.learning.javaBrains.youTube.unit1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Matthew","Arnold", 39)
        );

        // Step 1 : Sort list by last name
        sortList(people);

        // Step 2 : Create a method that prints all the elements in the list
        printList(people);

        // Step 3 : Create a method that prints all the people that have last name starting with a 'C'
        printListWithConditions(people);

        /**
         * The above method is very rigid and inflexible
         * The same can be done by coding to interfaces as below
         */

        printListWithConditions(people, new Condition() {
            @Override
            public boolean test(Person p) {
                if(p.getLastName().startsWith("C"))
                    return true;
                return false;
            }
        });

        /* Same method can be used for a different condition*/
        printListWithConditions(people, new Condition() {
            @Override
            public boolean test(Person p) {
                if(p.getFirstName().startsWith("C"))
                    return true;
                return false;
            }
        });
    }

    private static void printList(List<Person> l){
        System.out.println("\nPrinting list of person : \n ");
        for(Person p: l)
            System.out.println(p);
    };

    private static void printListWithConditions(List<Person> l){
        System.out.println("\nPrinting list of person whose name start with C: \n ");
        for(Person p: l)
            if(p.getLastName().startsWith("C"))
                System.out.println(p);
    };

    private static void printListWithConditions(List<Person> l, Condition condition){
        System.out.println("\nPrinting list of person whose name start with a condition: \n ");
        for(Person p: l)
            if(condition.test(p))
                System.out.println(p);
    };

    private static List<Person> sortList(List<Person> l){
        l.sort(new MyObjectNameComparator());
        return l;
    }

    /**
     * The above sort function can also be written using an inline anonymous class Comparator as below
      */

    private static List<Person> sortList2(List<Person> l){

        l.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        return l;
    }

    interface Condition{
        boolean test(Person p);
    }
}
