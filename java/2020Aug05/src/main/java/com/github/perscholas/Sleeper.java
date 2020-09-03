package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public interface Sleeper {
    default void sleepForSeconds(Integer timeInSeconds) {
        for (int i = 0; i < timeInSeconds; i++) {
            System.out.println("Elapsed wait time:\t" + timeInSeconds + " seconds.");
            sleepForMilliseconds(1000);
        }
    }

    default void sleepForMilliseconds(Integer timeInMilliseconds) {
        try {
            Thread.sleep(timeInMilliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
