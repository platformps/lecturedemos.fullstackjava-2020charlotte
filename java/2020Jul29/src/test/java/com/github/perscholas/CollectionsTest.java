package com.github.perscholas;

import org.junit.Test;

import java.util.*;

/**
 * Created by leon on 7/29/2020.
 */
public class CollectionsTest {
    @Test
    public void shuffleTest() {
        // given
        List<Integer> integerList = new ArrayList<>();
        for (Integer i = 100; i >= 0; i--) {
            integerList.add(i);
        }
        System.out.println("Before the shuffle, the order is...");
        System.out.println(integerList);

        // when
        Collections.shuffle(integerList);


        // then
        System.out.println("After the shuffle, the order is...");
        System.out.println(integerList);

        // then
        System.out.println("After the sort, the order is...");
        System.out.println(new TreeSet<>(integerList));
    }

    public void frequencyTest() {

    }
}