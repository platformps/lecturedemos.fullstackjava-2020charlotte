package com.github.perscholas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 8/19/2020.
 */
public class NameContainer {
    List<String> names = new ArrayList<>(Arrays.asList("Leon", "Christopher", "Hunter"));

    public String getNameAtIndex(int index) {
        return names.get(index);
    }

    public void addName(String name) {
        names.add(name);
    }

    public List<String> getNames() {
        return names;
    }

}
