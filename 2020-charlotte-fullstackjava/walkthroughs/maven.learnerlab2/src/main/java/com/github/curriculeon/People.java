package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 8/4/2020.
 */
abstract public class People<
        SomePersonType extends Person>
        implements Iterable<SomePersonType> {

    List<SomePersonType> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<SomePersonType> personList) {
        this.personList = personList;
    }

    public Integer count() {
        return personList.size();
    }

    public Boolean contains(SomePersonType somePerson) {
        return personList.contains(somePerson);
    }

    public void add(SomePersonType somePerson) {
        personList.add(somePerson);
    }

    public void removeAll() {
        personList.clear();
    }

    public void remove(SomePersonType somePerson) {
        personList.remove(somePerson);
    }

    public void removeById(Long id) {
        remove(findById(id));
    }

    public SomePersonType findById(Long id) {
        return personList
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst()
                .get();
    }

    abstract public SomePersonType[] toArray();

    @Override
    public Iterator<SomePersonType> iterator() {
        return personList.iterator();
    }
}
