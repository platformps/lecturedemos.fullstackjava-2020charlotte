package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class ThreadExtension extends Thread {
    public ThreadExtension(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        System.out.println(this.toString());
        for (Integer i = 0; i < 9999; i++) {
            System.out.println(getName() + " Does the maths and computes\t\t" + Math.pow(i, i.doubleValue()));
        }
    }

    @Override
    public String toString() {
        Long id = super.getId();
        String name = super.getName();
        int priority = super.getPriority();
        Thread.State state = super.getState();
        String threadGroupName = super.getThreadGroup().getName();
        return new StringBuilder()
                .append("id = " + id)
                .append("\nname = " + name)
                .append("\npriority = " + priority)
                .append("\nthreadGroupName = " + threadGroupName)
                .append("\nstate = " + state.toString())
                .toString();
    }
}
