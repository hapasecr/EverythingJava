package com.learning.javaBrains.advancedJava.lambdas;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceExamples2 {
    public static void main(String[] args) {

        Function<Person, String> getName = person -> person.getName();
        Function<Person, String> getName2 = Person::getName;

        // Checking if two Person are equal
        Person p1 = new Person("foo", 25);
        Person p2 = new Person("bar", 42);

        BiPredicate<Person, Person> isEquals = (person1, person2) -> person1.equals(person2);
        BiPredicate<Person, Person> isEquals2 = Person::equals;

        System.out.println(isEquals.test(p1, p2));
        System.out.println(isEquals2.test(p1, p2));

        System.out.println();

        // Counting the number of objects in the List

        List<Object> stringList = new ArrayList<Object>(Arrays.asList("foo", "bar"));
        List<Object> intList = new ArrayList<Object>(Arrays.asList(1,2,3,4,5));

        Function<List<Object>, Integer> countObjects = List::size;

        System.out.println(countObjects.apply(stringList));
        System.out.println(countObjects.apply(intList));

        // Function to take in a List and return unique values in it ( remove duplicates )
        Function<List<String>,Collection<String>> dedupe = list -> new HashSet<>(list);
        Function<List<String>, Collection<String>> dedupe2 = HashSet::new; // Class::Constructor

    }

}
