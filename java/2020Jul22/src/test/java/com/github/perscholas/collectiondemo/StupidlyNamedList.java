package com.github.perscholas.collectiondemo;

import com.github.perscholas.enums.Person;
import org.junit.Test;

import java.util.*;

/**
 * Created by leon on 7/22/2020.
 */
public class StupidlyNamedList {
    @Test
    public void testProperlyNamedList() {
        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());

        System.out.println(list);
    }

    @Test
    public void stupidNamedList() {
        List<Person> list = Arrays.asList();
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());

        System.out.println(list);
    }

    @Test
    public void convertFromArrayToList() {
        Person[] array = new Person[]{
                new Person(),
                new Person(),
                new Person(),
                new Person(),
                new Person(),
        };

        List<Person> unmodifiableList = Arrays.asList(array);
        List<Person> modifiableList = new ArrayList<>(unmodifiableList);
        Set<Person> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        modifiableList.add(new Person());
        System.out.println(modifiableList);

        printAllElements(map.entrySet());
        printAllElements(set);
        printAllElements(unmodifiableList);
        printAllElements(modifiableList);
    }

    public void printAllElements(Iterable<?> iterableObjects) {
        iterableObjects.forEach(System.out::println);
    }
}
