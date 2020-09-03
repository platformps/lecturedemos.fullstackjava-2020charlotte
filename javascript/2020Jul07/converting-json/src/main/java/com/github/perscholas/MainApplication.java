package com.github.perscholas;

import java.util.Date;

public class MainApplication {
    public static void main(String[] args) {
        Person person = new Person("Leon", "Hunter", new Date());
        String json = person.toString();
        System.out.println(json);
    }
}
