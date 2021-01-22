package com.github.perscholas;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class WordMappingTest {

    @Test
    public void testHashMap() {
        // given
        Map<String, Integer> map = new LinkedHashMap<>();
        TextDocument textDocument = new TextDocument();
        String someText = textDocument.toString();
        String[] words = someText
                .replaceAll("\n", "") // remove all new lines
                .replaceAll("\\.", "") // remove all double-quotes
                .replaceAll("\"", "") // remove all double-quotes
                .replaceAll(",", "") // remove all commas
                .replaceAll("“", "") // remove all curly quotes
                .toLowerCase() // convert all text to lower case
                .split(" "); // split the string on all spaces


        // when
        for (int i = 0; i < words.length; i++) {
            String key = words[i]; // fetch each word from `someText`
            int numberOfOccurrences = map.getOrDefault(key, 0); // identify number of times this word has occurred
            map.put(key, numberOfOccurrences + 1); // insert the key and value mapping
        }


        // then
        map.forEach((k, v) -> {
            System.out.println("The key is = " + k);
            System.out.println("The val is = " + v);
            System.out.println("\n\n");
        });
        System.out.println(map);
    }
}
