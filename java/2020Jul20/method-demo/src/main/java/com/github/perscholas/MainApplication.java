package com.github.perscholas;

import com.github.perscholas.someotherpackage.StaticPublicPool;

import java.util.Date;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        new MainApplication().demonstrateAggregation();
    }

    public void demonstrateAggregation() {
        Person person = new Person();
        Person person2 = person;
        person = null;
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person2);
    }

    private void demonstrateOverloading() {
        Date birthDate =  new Date();
        StaticPublicPool.addPerson("Leon Hunter");
    }

    public void demonstrateStaticMethods() {
        StaticPublicPool.addPerson("Leon");
        StaticPublicPool.removePerson();
    }
}
