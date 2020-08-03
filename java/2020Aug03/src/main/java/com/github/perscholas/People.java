package com.github.perscholas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by leon on 8/3/2020.
 */
public class People<SomePersonType extends Person> {
    private List<SomePersonType> list;

    public People(List<SomePersonType> list) {
        this.list = list;
    }

    public People() {
        this(new ArrayList<>());
    }

    public void add(SomePersonType somePerson) {
        list.add(somePerson);
    }

    public void remove(SomePersonType somePerson) {
        list.remove(somePerson);
    }

    public SomePersonType findById(Long id) {
        Optional<SomePersonType> optionalPerson = list
                .stream()
                .sorted()
                .filter(person -> person.getId().equals(id))
                .findFirst();
        SomePersonType personForSure = optionalPerson.orElseGet(() -> (SomePersonType)new Person());
        return personForSure;
    }
}
