package com.github.perscholas;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 8/3/2020.
 */
public class NestedStreamNonsenseThatWeHaveToLiveWith {
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Test
    public void testLettersFunctionally() {
        letters("Christopher").forEach(System.out::println);
    }

    @Test
    public void testLettersIteratively() {
        String[] arrayOutput = new String[] {"C", "h", "r", "i", "s", "t", "o", "p", "h", "e", "r"};
        for (int i = 0; i < arrayOutput.length; i++) {
            String letter = arrayOutput[i];
            System.out.println(letter);
        }
    }

    private Stream<String> letters(String someWord) {
        String[] characters = someWord.split("");
        return Stream.of(characters);
    }

    private Stream<Stream<String>> wordsNestedMap(String[] stringArray) {
        return Arrays.stream(stringArray).map(this::letters);
    }
}
