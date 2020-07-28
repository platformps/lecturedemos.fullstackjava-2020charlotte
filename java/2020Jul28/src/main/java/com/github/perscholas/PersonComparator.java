package com.github.perscholas;

import java.util.Comparator;

/**
 * Created by leon on 7/28/2020.
 */
public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        if (person1 == person2) { // if they're same instance
            return 0; // then their order does not matter
        } else if (person1.getFirstName().compareTo(person2.getFirstName()) == 1) { // if they're different instance && person1 firstName comes before person2, then
            // person1 comes first
            return 1;
        } else { 
            // person2 comes first
            return -1;
        }
    }
}
