package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class RunnableImplementation implements Runnable {
    @Override
    public void run() {
        for (Integer i = 0; i < 9999; i++) {
            System.out.println(Thread.currentThread().getName() + " Does the maths and computes\t\t" + Math.pow(i, i.doubleValue()));
        }

        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        Thread currentThread = Thread.currentThread();
        Long id = currentThread.getId();
        String name = currentThread.getName();
        int priority = currentThread.getPriority();
        Thread.State state = currentThread.getState();
        String threadGroupName = currentThread.getThreadGroup().getName();
        return new StringBuilder()
                .append("id = " + id)
                .append("\nname = " + name)
                .append("\npriority = " + priority)
                .append("\nthreadGroupName = " + threadGroupName)
                .append("\nstate = " + state.toString())
                .toString();
    }
}
