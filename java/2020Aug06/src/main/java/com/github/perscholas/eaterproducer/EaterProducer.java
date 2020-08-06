package com.github.perscholas.eaterproducer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by leon on 8/6/2020.
 */
public class EaterProducer {
    private static final Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    private static final long startTime = System.currentTimeMillis();

    public class Eater implements Runnable {
        @Override
        public void run() {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = 10000;
            long endTime = startTime + elapsedTime;
            while (currentTime < endTime) {
                synchronized (queue) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if (!queue.isEmpty()) {
                    Integer val = queue.poll();
                    System.out.println(Thread.currentThread().getName() + ":\t\t" + val);
                }
                currentTime = System.currentTimeMillis();
            }
        }
    }

    public static class Producer implements Runnable {

        @Override
        public void run() {
            long currentTime = System.currentTimeMillis();
            long elapsedTime = 10000;
            long endTime = startTime + elapsedTime;
            int valueToAddToQueue = 0;
            while (currentTime < endTime) {
                queue.add(valueToAddToQueue++);
                synchronized (queue) {
                    queue.notify();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                currentTime = System.currentTimeMillis();
            }

            synchronized (queue) {
                queue.notifyAll();
            }

        }
    }
}
