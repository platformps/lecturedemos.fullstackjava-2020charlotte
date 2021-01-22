package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class JoinThreadTest {
    public static void main(String[] args) {
        Thread testThread = new Thread(new ThreadExtension(""), "testThread");
        testThread.start();
        System.out.println(testThread.getName() + " has started");
        try {
            testThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(testThread.getName() + " has finished");
    }
}
