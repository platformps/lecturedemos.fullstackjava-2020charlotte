package com.github.perscholas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

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

    public void removeById(Long id) {
        remove(findById(id));
    }

    public SomePersonType where(Predicate<SomePersonType> filterClause) {
        return list
                .stream()
                .filter(filterClause)
                .findFirst()
                .get();
    }

    public SomePersonType findByFirstName(String firstName) {
        return where(person -> person.getFirstName().equalsIgnoreCase(firstName));
    }

    public SomePersonType findById(Long id) {
        return where(person -> person.getId().equals(id));
    }

    public void removeAll() {
        list.clear();
    }

    public Boolean contains(SomePersonType somePerson) {
        return list.contains(somePerson);
    }

    public Integer count() {
        return list.size();
    }
}
