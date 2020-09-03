package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class ThreadSleepTest {
    public static void main(String[] args) {
        Long startTime = System.nanoTime();
        threadSleepDemo();
        Long endTime = System.nanoTime();
        Long timeDelta = endTime - startTime;
        System.out.println("Took " + timeDelta + " nanoseconds to execute");
    }

    public static void threadSleepDemo() {
        threadSleepInSeconds(10);
    }

    public static void threadSleepInSeconds(Integer seconds) {
        threadSleepInMilliseconds(seconds * 1000);
    }

    public static void threadSleepInMilliseconds(Integer milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException("That came from leon", e);
        }
    }

}
