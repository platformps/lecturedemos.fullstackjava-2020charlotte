package com.github.perscholas;

/**
 * Created by leon on 7/29/2020.
 */
public class RunnableObj {
    public void doYourJob() {
        Runnable lambdaExpression = () -> System.out.println("Hello world");
        Runnable methodToBePassed = this::soutHelloWorld;
    }

    public void soutHelloWorld() {
        System.out.println("Hello world");
    }
}
