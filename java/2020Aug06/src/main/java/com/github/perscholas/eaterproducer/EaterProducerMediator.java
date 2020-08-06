package com.github.perscholas.eaterproducer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by leon on 8/6/2020.
 */
public class EaterProducerMediator {
    private static final Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    private static final long startTime = System.currentTimeMillis();

    public static Queue<Integer> getQueue() {
        return queue;
    }

    public static long getStartTime() {
        return startTime;
    }
}
