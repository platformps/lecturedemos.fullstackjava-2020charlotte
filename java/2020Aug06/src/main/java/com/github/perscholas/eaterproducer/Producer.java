package com.github.perscholas.eaterproducer;

/**
 * Created by leon on 8/6/2020.
 */
public  class Producer implements Runnable {

    @Override
    public void run() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = 10000;
        long endTime = EaterProducerMediator.getStartTime() + elapsedTime;
        int valueToAddToQueue = 0;
        while (currentTime < endTime) {
            EaterProducerMediator.getQueue().add(valueToAddToQueue++);
            synchronized (EaterProducerMediator.getQueue()) {
                EaterProducerMediator.getQueue().notify();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            currentTime = System.currentTimeMillis();
        }

        synchronized (EaterProducerMediator.getQueue()) {
            EaterProducerMediator.getQueue().notifyAll();
        }

    }
}