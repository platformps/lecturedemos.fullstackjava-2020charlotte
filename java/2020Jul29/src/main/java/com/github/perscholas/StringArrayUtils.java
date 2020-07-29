package com.github.perscholas;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 7/29/2020.
 */
public class StringArrayUtils {
    public Integer getNumberOfOccurrences(String[] strings, String particularValue) {
        return Collections.frequency(Arrays.asList(strings), particularValue);
    }
}