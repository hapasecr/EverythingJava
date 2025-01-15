package com.learning.javaBrains.youTube.unit1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Matthew","Arnold", 39)
        );

        // Step 1 : Sort list by last name
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2 : Create a method that prints all the elements in the list
        printListWithConditions(people, p -> true, p -> System.out.println(p));

        // Step 3 : Create a method that prints all the people that have last name starting with a 'C'
        printListWithConditions(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        printListWithConditions(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));

    }

    private static void printListWithConditions(List<Person> l, Predicate<Person> predicate, Consumer<Person> consumer){
        System.out.println();
        for(Person p: l)
            if(predicate.test(p))
                consumer.accept(p);
    };

}
