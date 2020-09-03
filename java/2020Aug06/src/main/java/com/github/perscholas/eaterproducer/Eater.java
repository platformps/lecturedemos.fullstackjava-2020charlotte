package com.github.perscholas.eaterproducer;

/**
 * Created by leon on 8/6/2020.
 */

public class Eater implements Runnable {
    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = 10000;
        long endTime = EaterProducerMediator.getStartTime() + elapsedTime;
        while (currentTime < endTime) {
            synchronized (EaterProducerMediator.getQueue()) {
                try {
                    EaterProducerMediator.getQueue().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (!EaterProducerMediator.getQueue().isEmpty()) {
                Integer val = EaterProducerMediator.getQueue().poll();
                System.out.println(Thread.currentThread().getName() + ":\t\t" + val);
            }
            currentTime = System.currentTimeMillis();
        }
    }
}

