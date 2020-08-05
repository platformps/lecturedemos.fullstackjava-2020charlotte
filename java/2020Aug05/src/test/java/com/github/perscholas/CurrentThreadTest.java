package com.github.perscholas;

import org.junit.Test;

/**
 * Created by leon on 8/5/2020.
 */
public class CurrentThreadTest {
    @Test
    public void test() {
        Thread currentThread = Thread.currentThread();
        Long id = currentThread.getId();
        String name = currentThread.getName();
        int priority = currentThread.getPriority();
        Thread.State state = currentThread.getState();
        String threadGroupName = currentThread.getThreadGroup().getName();
        System.out.println(new StringBuilder()
                .append("id = " + id)
                .append("\nname = " + name)
                .append("\npriority = " + priority)
                .append("\nthreadGroupName = " + threadGroupName));
    }
}
