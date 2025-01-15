package com.learning.javaBrains.youTube.unit2;

import com.learning.javaBrains.youTube.unit1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll", 42),
                new Person("Thomas","Carlyle", 51),
                new Person("Charlotte","Bronte", 45),
                new Person("Matthew","Arnold", 39)
        );

        // Step 2 : Create a method that prints all the elements in the list
        printListWithConditions(people, p -> true, p -> System.out.println(p));

        System.out.println("\nAfter using MethodReference");

        //The above can be also written using MethodReference as :
        printListWithConditions(people, p -> true, System.out::println);

    }

    private static void printListWithConditions(List<Person> l, Predicate<Person> predicate, Consumer<Person> consumer){
        System.out.println();
        for(Person p: l)
            if(predicate.test(p))
                consumer.accept(p);
    };

}
