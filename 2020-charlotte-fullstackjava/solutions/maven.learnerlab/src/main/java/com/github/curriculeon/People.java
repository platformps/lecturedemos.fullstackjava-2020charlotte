package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 7/22/2020.
 */
abstract public class People<SomePersonType extends Person> implements Iterable<SomePersonType> {
    List<SomePersonType> personList;

    public People() {
        this(new ArrayList<>());
    }

    public People(List<SomePersonType> personList) {
        this.personList = personList;
    }

    public void add(SomePersonType person) {
        this.personList.add(person);
    }

    public SomePersonType findById(long id) {
        for (int i = 0; i < personList.size(); i++) {
            SomePersonType person = personList.get(i);
            if (person.getId() == id) { //if the id is correct,
                return person; // return person
            } else { // if its the wrong id,
                continue; // keep lookin'!
            }
        } // finished loop; we've finished lookin'
        return null; // we were not able to find the person with the id
    }

    public SomePersonType findByIdExpanded(long id) {
        for (int i = 0; i < personList.size(); i++) {
            SomePersonType person = personList.get(i);
            if (person.getId() == id) { //if the id is correct,
                return person; // return person
            } else { // if its the wrong id,
                continue; // keep lookin'!
            }
        } // finished loop; we've finished lookin'
        return null; // we were not able to find the person with the id
    }

    public Boolean contains(SomePersonType specifiedPerson) {
        return personList.contains(specifiedPerson);
    }

    public void remove(SomePersonType someSpecificPerson) {
        personList.remove(someSpecificPerson);
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    abstract public SomePersonType[] toArray();

    @Override
    public Iterator<SomePersonType> iterator() {
        return personList.iterator();
    }
}