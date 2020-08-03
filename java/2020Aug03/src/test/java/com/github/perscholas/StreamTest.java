package com.github.perscholas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 8/3/2020.
 */
public class StreamTest {
    @Test
    public void generalDemonstration() {
        String[] stringArray = new String[]{"The", "Quick", "Brown", "Fox"};
        List<SomePojo> dtoList = Stream
                .of(stringArray)
                .parallel()
                .filter(str -> str.startsWith("T"))
                .filter(str -> str.length() > 2)
                .map(SomePojo::new) // not a `Map` object; this is a transforming Stream of current-type to Stream of new-type
                .filter(somePojo -> somePojo.doYaThang().equalsIgnoreCase("always"))
                .collect(Collectors.toList());
    }

    @Test
    public void testGenerateUsingMultiExpressionWithMethodReferences() {
        Supplier<Double> doubleGenerator = Math::random; // static method reference to a Supplier<Double>
        Consumer<Double> doubleConsumer = System.out::println; //  instance method reference to a Consumer<String>

        Stream<Double> randoms = Stream.generate(doubleGenerator);
        randoms.forEach(doubleConsumer);
    }

    @Test
    public void testGenerateUsingOneExpressionWithLambdaExpressions() {
        Stream
                .generate(()-> Math.random()) // lambda expression in the form of Supplier<Double>
                .forEach(randomVal -> System.out.println(randomVal)); // lambda expression in the form of Consumer<Double>
    }

    @Test
    public void testGenerateUsingOneExpressionWithStaticMethodReferences() {
        Stream
                .generate(Math::random) // static method reference to a Supplier<Double>
                .forEach(System.out::println); // instance method reference to a Consumer<String>
    }

    @Test
    public void testGenerateUsingOneExpressionWithInstanceMethodReferences() {
        Stream
                .generate(this::echo) // instance method reference
                .forEach(System.out::println); //  instance method reference to a Consumer<String>
    }

    private String echo() {
        return "ECHO ECHo ECho Echo echo";
    }

}
