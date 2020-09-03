package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class InterruptThreadTest {
    public static void main(String[] args) {
        interruptThreadTest();
    }

    public static void interruptThreadTest() {
        // given
        Runnable runnyFred = new WaitingThread();
        Thread sleepyFred = new Thread(runnyFred, "Fred 2");

        // when
        sleepyFred.start();
        sleepyFred.interrupt();
        System.out.println("Next instruction no problem");
        // then
    }
}
