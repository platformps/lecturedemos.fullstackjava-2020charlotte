package com.github.perscholas;

import org.junit.Assert;

/**
 * Created by leon on 8/5/2020.
 * the intent of this class is to demonstrate that concurrently modifying a single reference
 * in memory can lead to unintended, unexpected, and unpredictable output
 */
public class ConcurrentModificationExceptionPreventerTest implements Sleeper {
    public static void main(String[] args) {
        new ConcurrentModificationExceptionPreventerTest().testJoiningThread2();
    }

    private void testSleeping() {
        /** Given */
        // given there are two threads
        Thread thread1 = new Thread(new ConcurrentModificationExceptionPreventer());
        Thread thread2 = new Thread(new ConcurrentModificationExceptionPreventer());

        // given the ending value is `${some-value}`
        int expectedEndingValue = ConcurrentModificationExceptionPreventer.getEndValue();

        // given the expected starting value is `0`
        int expectedStartValue = 0;
        int actualStartingValue = ConcurrentModificationExceptionPreventer.getCurrentValue();
        Assert.assertEquals(actualStartingValue, expectedStartValue, 0);

        // given both threads have began running
        thread1.start();
        thread2.start();

        // given both threads have finished running
        sleepForSeconds(15);

        /** When */
        int actualEndingValue = ConcurrentModificationExceptionPreventer.getCurrentValue();

        /** Then */
        System.out.println("Current thread name = " + Thread.currentThread().getName());
        System.out.println("Thread1 name = " + thread1.getName());
        System.out.println("Thread2 name = " + thread1.getName());
        System.out.println("Expected ending value = " + expectedEndingValue);
        System.out.println("Actual ending value = " + actualEndingValue);
        System.out.println("Values are equal = " + (expectedEndingValue == actualEndingValue));
    }



    private void testJoiningBoth() {
        /** Given */
        // given there are two threads
        Thread thread1 = new Thread(new ConcurrentModificationExceptionPreventer());
        Thread thread2 = new Thread(new ConcurrentModificationExceptionPreventer());

        // given the ending value is `${some-value}`
        int expectedEndingValue = ConcurrentModificationExceptionPreventer.getEndValue();

        // given the expected starting value is `0`
        int expectedStartValue = 0;
        int actualStartingValue = ConcurrentModificationExceptionPreventer.getCurrentValue();
        Assert.assertEquals(actualStartingValue, expectedStartValue, 0);

        // given both threads have began running
        thread1.start();
        thread2.start();

        // given both threads have finished running
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /** When */
        int actualEndingValue = ConcurrentModificationExceptionPreventer.getCurrentValue();

        /** Then */
        System.out.println("Current thread name = " + Thread.currentThread().getName());
        System.out.println("Thread1 name = " + thread1.getName());
        System.out.println("Thread2 name = " + thread1.getName());
        System.out.println("Expected ending value = " + expectedEndingValue);
        System.out.println("Actual ending value = " + actualEndingValue);
        System.out.println("Values are equal = " + (expectedEndingValue == actualEndingValue));
    }


    private void testJoiningThread2() {
        /** Given */
        // given there are two threads
        Thread thread1 = new Thread(new ConcurrentModificationExceptionPreventer());
        Thread thread2 = new Thread(new ConcurrentModificationExceptionPreventer());

        // given the ending value is `${some-value}`
        int expectedEndingValue = ConcurrentModificationExceptionPreventer.getEndValue();

        // given the expected starting value is `0`
        int expectedStartValue = 0;
        int actualStartingValue = ConcurrentModificationExceptionPreventer.getCurrentValue();
        Assert.assertEquals(actualStartingValue, expectedStartValue, 0);

        // given both threads have began running
        thread1.start();
        thread2.start();

        // given both threads have finished running
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /** When */
        int actualEndingValue = ConcurrentModificationExceptionPreventer.getCurrentValue();

        /** Then */
        System.out.println("Current thread name = " + Thread.currentThread().getName());
        System.out.println("Thread1 name = " + thread1.getName());
        System.out.println("Thread2 name = " + thread1.getName());
        System.out.println("Expected ending value = " + expectedEndingValue);
        System.out.println("Actual ending value = " + actualEndingValue);
        System.out.println("Values are equal = " + (expectedEndingValue == actualEndingValue));
    }
}
