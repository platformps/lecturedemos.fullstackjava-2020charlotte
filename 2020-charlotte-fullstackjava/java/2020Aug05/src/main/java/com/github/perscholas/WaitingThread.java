package com.github.perscholas;

/**
 * Created by leon on 8/5/2020.
 */
public class WaitingThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
