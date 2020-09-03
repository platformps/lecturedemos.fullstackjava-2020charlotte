package com.github.perscholas;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by leon on 8/3/2020.
 */
public class FunctionalInterfacesTest {
    @Test
    public void testConvertMethodToFunctionToPredicate() {
        Function<String, Boolean> methodReferenceAsFunction = this::isGreaterThan10;
        Predicate<String> methodReferenceAsPredicate = this::isGreaterThan10;

        BiFunction<String, Integer, Boolean> methodReferenceAsBiFunction = this::isGreaterThan10AndLessThan5;
        BiPredicate<String, Integer> methodReferenceAsBiPredicate = this::isGreaterThan10AndLessThan5;
    }

    @Test
    public void testVariablesUsedInLambdaMustBeFinal() {
        int x = 10;
        Runnable r = () -> {
            // x++; // TODO - uncomment this & read the error message displayed by compiler
        };
    }

    public boolean isGreaterThan10AndLessThan5(String str, Integer x) {
        return str.compareTo(x.toString()) == 1; // TODO - redefine method body to abide by method-name-intent
    }

    public boolean isGreaterThan10(String str) {
        return str.length() > 5;
    }
}
