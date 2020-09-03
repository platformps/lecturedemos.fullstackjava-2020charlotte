package com.github.perscholas;

import org.junit.Test;

import java.util.*;
import java.util.function.*;

/**
 * Created by leon on 7/29/2020.
 */
public class BuiltInFunctionalInterfacesTest {
    @Test
    public void runnableTest() {
        Runnable oneLine = () -> System.out.println("");
        Runnable multiLine = () -> {
            System.out.println("line 1");
            System.out.println("line 2");
        };

        Runnable methodReference = this::runnableTest;
        Runnable anonymousInnerClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("line1");
                System.out.println("line2");
            }
        };


        oneLine.run();
        multiLine.run();
    }

    @Test
    public void consumerTest() {
        Consumer<String> oneLine = (somethingBeingConsumed) -> System.out.println(somethingBeingConsumed);
        Consumer<String> multiLine = (somethingBeingConsumed) -> {
            System.out.println("Line 1");
            System.out.println("Line 2");
            System.out.println(somethingBeingConsumed);
        };

        Consumer<String> methodReference = System.out::println;
    }

    @Test
    public void biConsumerTest() {
        BiConsumer<Date, Integer> oneLine = (someDate, someInt) -> System.out.println("" + someDate + someInt);
        BiConsumer<Date, Integer> multiLine = (someDate, someInt) -> {
            // TODO - define something to be done with `someDate` and `someInt`
        };

        BiConsumer<List<String>, String> methodReference = Collections::frequency;
    }

    @Test
    public void supplierTest() {
        Supplier<Double> oneLine = () -> new Random().nextDouble();
        Supplier<Double> multiLine = () -> {
            Random random = new Random();
            double result = random.nextDouble();
            return result;
        };

        Supplier<Double> methodReference = new Random()::nextDouble;
    }

    @Test
    public void functionTest() {
        Function<String, Integer> oneLine = (str) -> str.length();
        Function<String, Integer> multiLine = (str) -> {
            int numberOfCharactersInStr = str.length();
            return numberOfCharactersInStr;
        };

        Function<String, Integer> methodReference = Integer::valueOf;
    }


    @Test
    public void biFunctionTest() {
        BiFunction<String, String, Integer> oneLine = (str1, str2) -> (str1 + str2).length();
        BiFunction<String, String, Integer> multiLine = (str1, str2) -> {
            String str3 = str1 + str2;
            Integer result = str3.length();
            return result;
        };

        BiFunction<List<String>, String, Integer> methodReference = Collections::frequency;
    }

    @Test
    public void nestedFunctionTest() {
        BiFunction<BiFunction<String, String, Integer>, String, Integer> func = null;
    }

    @Test
    public void supplierRandomNumberGenerator() {
        Supplier<Double> doubleSupplier = () -> new Random().nextDouble();
        for (int i = 0; i < 10; i++) {
            Double randomDoubleValue = doubleSupplier.get();
            System.out.println(randomDoubleValue);
        }
    }
}