package com.github.perscholas.inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by leon on 7/20/2020.
 */
public class Bird extends Animal implements Flyer {
    @Override
    public void fly(int distance) {
//        this.setLocation(getX(), getY()+distance);
    }

    @Override
    public String speak() {
        return "chirp!";
    }

    public void operateOnEachString(Iterable<String> list) {
        return;
    }
}
