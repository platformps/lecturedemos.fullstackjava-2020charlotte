package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 * the intent of this class is to demonstrate that concurrently modifying a single reference
 * in memory can lead to unintended, unexpected, unpredictable output
 */
public class ConcurrentModificationExceptionPreventer implements Runnable {
    private static Integer currentValue = 0;
    private static Integer endValue = 999999;


    @Override
    public void run() {
        synchronized (ConcurrentModificationExceptionPreventer.class) {
            while (currentValue < endValue) {
                increment();
            }
        }
    }

    private void increment() {
        System.out.println(currentValue);
        currentValue++;
    }

    public static Integer getCurrentValue() {
        return currentValue;
    }

    public static Integer getEndValue() {
        return endValue;
    }
}
