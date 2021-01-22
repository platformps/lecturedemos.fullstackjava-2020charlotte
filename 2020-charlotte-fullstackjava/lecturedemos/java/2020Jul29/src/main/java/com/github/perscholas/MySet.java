package com.github.perscholas;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by leon on 7/29/2020.
 */
public class MySet<E> extends ArrayList<E> {
    @Override
    public boolean add(E obj) {
        if(this.contains(obj)) {
            return false;
        }
        super.add(obj);
        return true;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
