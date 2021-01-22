package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        Character char1 = input.charAt(0);
        Character char2 = input.charAt(1);
        Character char3 = input.charAt(2);
        return "" + char1 + char2 + char3;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int numberOfCharacters = input.length();
        int indexToEndSubstring = numberOfCharacters;
        int indexToBeginSubstring = numberOfCharacters-3;
        return input.substring(indexToBeginSubstring, indexToEndSubstring);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        boolean areSameValue = inputValue.equals(comparableValue);
        return areSameValue;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int numberOfCharacters = inputValue.length()-1;
        int middleIndex = numberOfCharacters/2;
        char middleCharacter = inputValue.charAt(middleIndex);
        return middleCharacter;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        String firstWord = words[0];
        return firstWord;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        String secondWord = words[1];
        return secondWord;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String result = "";
        for(int i = stringToReverse.length(); i > 0; i--) {
            Character currentCharacter = stringToReverse.charAt(i-1);
            result += currentCharacter;
        }
        return result;
    }


    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverseSB(String stringToReverse){
        StringBuilder sb = new StringBuilder(stringToReverse);
        sb.reverse();
        String result = sb.toString();
        return result;
    }
}
