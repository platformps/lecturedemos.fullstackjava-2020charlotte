package com.github.perscholas;

import org.junit.Test;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by leon on 7/29/2020.
 */
public class ExpressFlyerAsLambda {
    @Test
    public void test() {
        Flyer flyer = (String str, double intVal) ->{
            System.out.println(str + intVal);
            System.out.println("Another print");
        };

        Flyable flyable = () -> System.out.println("Hey I'm flyable");
    }

    @Test
    public void builtInFunctionalInterfaces() {
        Runnable runnable = () -> System.out.println("");
        Consumer<String> consumer = (somethingBeingConsumed) -> System.out.println(somethingBeingConsumed);
        BiConsumer<Date, Integer> biConsumer = (someDate, someInt) -> {
            // TODO - define something to be done with `someDate` and `someInt`
        };
    }
}
