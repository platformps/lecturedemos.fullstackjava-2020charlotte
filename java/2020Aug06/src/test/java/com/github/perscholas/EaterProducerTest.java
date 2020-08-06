package com.github.perscholas;

import com.github.perscholas.eaterproducer.Eater;
import com.github.perscholas.eaterproducer.Producer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by leon on 8/6/2020.
 */
public class EaterProducerTest {
    public static void main(String[] args) {
        List<Thread> eaterThreads = createThreadPool(5, Eater::new); // create 5 eaters
        Thread producerThread = new Thread(new Producer(), "Producer"); // create 1 producer
        eaterThreads.forEach(Thread::start); // start all 5 eaters
        producerThread.start(); // start the 1 producer
        eaterThreads.forEach(thread -> {
            try { // `join` each eater
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        try {
            producerThread.join(); // `join` producer thread
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Thread> createThreadPool(Integer numberOfThreads, Supplier<Runnable> runnableGenerator) {
        Thread[] eaterThreads = new Thread[numberOfThreads];
        for (int i = 0; i < eaterThreads.length; i++) {
            String threadName = "consumer - " + i;
            Runnable newRunnable = runnableGenerator.get();
            Thread thread = new Thread(newRunnable, threadName);
            eaterThreads[i] = thread;
        }
        return Arrays.asList(eaterThreads);
    }
}
