package com.company;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;

public class BoundedBuffer {
    private Lock lock = new ReentrantLock();
    Condition notFullCondition = lock.newCondition();
    Condition notEnptyCondition = lock.newCondition();

    Object[] items = new Object[100];
    int count, putIndex, takeIndex;

    public void put(Object x) throws InterruptedException {
        lock.lock();
        try {
            while(count == items.length) {
                notFullCondition.wait();
            }
            items[putIndex] = x;
            if (++putIndex == items.length) {
                putIndex = 0;
            }
            count++;
            notEnptyCondition.notify();
        } finally {
            lock.unlock();
        }
    }

    public Object consume() throws InterruptedException {
        lock.lock();
        try {
            while(count == 0) {
                notEnptyCondition.wait();
            }
            Object x = items[takeIndex];
            if (++takeIndex == items.length) {
                takeIndex = 0;
            }
            count--;
            notFullCondition.notify();
            return x;
        } finally {
            lock.unlock();
        }
    }
}

/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
class ConsumerProducer{
    public static void main(String[] args) {
        Semaphore semaphoreProducer=new Semaphore(1);
        Semaphore semaphoreConsumer=new Semaphore(0);
        System.out.println("semaphoreProducer permit=1 | semaphoreConsumer permit=0");

        Producer producer=new Producer(semaphoreProducer,semaphoreConsumer);
        Consumer consumer=new Consumer(semaphoreConsumer,semaphoreProducer);

        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");

        producerThread.start();
        consumerThread.start();
    }
}

/**
 * Producer Class.
 */
class Producer implements Runnable{
    Semaphore semaphoreProducer;
    Semaphore semaphoreConsumer;

    public Producer(Semaphore semaphoreProducer,Semaphore semaphoreConsumer) {
        this.semaphoreProducer=semaphoreProducer;
        this.semaphoreConsumer=semaphoreConsumer;
    }

    public void run() {
        for(int i=1;i<=5;i++){
            try {
                semaphoreProducer.acquire();
                System.out.println("Produced : "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphoreConsumer.release();
            }
        }
    }
}

/**
 * Consumer Class.
 */
class Consumer implements Runnable{
    Semaphore semaphoreConsumer;
    Semaphore semaphoreProducer;

    public Consumer(Semaphore semaphoreConsumer,Semaphore semaphoreProducer) {
        this.semaphoreConsumer=semaphoreConsumer;
        this.semaphoreProducer=semaphoreProducer;
    }

    public void run() {

        for(int i=1;i<=5;i++){
            try {
                semaphoreConsumer.acquire();
                System.out.println("Consumed : "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphoreProducer.release();
            }
        }
    }
}
