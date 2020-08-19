package com.github.perscholas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Created by leon on 8/19/2020.
 */
public class NameContainerTest {
    @Test
    public void testGetNameAtIndex2() {
        // given
        int index = 2;
        String expected = "Hunter";
        NameContainer nameContainer = new NameContainer();

        // when
        String actual =nameContainer.getNameAtIndex(index);

        // then
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testGetNameAtIndex0() {
        // given
        int index = 0;
        String expected = "Leon";
        NameContainer nameContainer = new NameContainer();

        // when
        String actual = nameContainer.getNameAtIndex(index);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddName() {
        // given
        String nameToBeTested = "jared";
        NameContainer nameContainer = new NameContainer();
        List<String> prePopulatedNames = nameContainer.getNames();
        Assertions.assertFalse(prePopulatedNames.contains(nameToBeTested));

        // when
        nameContainer.addName(nameToBeTested);

        // then
        Assertions.assertTrue(prePopulatedNames.contains(nameToBeTested));
    }
}
