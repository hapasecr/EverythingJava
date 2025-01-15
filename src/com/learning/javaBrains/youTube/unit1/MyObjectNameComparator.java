package com.learning.javaBrains.youTube.unit1;

import java.util.Comparator;

public class MyObjectNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
