package com.github.perscholas.collectiondemo;

import com.github.perscholas.enums.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/22/2020.
 */
public class DynamicListDemo {
    @Test
    public void testArray() {
        Person[] array = new Person[10];
        array[0] = new Person();
        array[1] = new Person();
        // ...
        array[8] = new Person();
        array[9] = new Person();

        if(allElementsAreOccupied(array)) {
            array = new Person[array.length + 5];
        }
    }

    private boolean allElementsAreOccupied(Person[] array) {
        return false;
    }

    @Test
    public void testList() {
        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
    }
}
