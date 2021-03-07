package com.elvis.training_java_labs;



/*
Re-entrant lock has the same behaviour as the synchronized lock
but with additional features.
 */


/*
NB
Deadlock describes a situation where two or more threads are blocked forever,
waiting for each other. Deadlock occurs when multiple threads need the same
locks but obtain them in different order.
 */


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Re_entrant_Lock {
    private static int counter = 0;
    private static Lock lock = new ReentrantLock();
    public static void increment(){
//        Using reentrant locks with methods without exceptions
//        lock.lock();
//
//        for(int i=0;i < 100000;i++){
//            counter++;
//        }
//        lock.unlock();



//        Using reentrant lock with methods with exceptions
        lock.lock();
        try {
            for(int i=0;i < 100000;i++){
                counter++;
            }
        }finally {
            lock.unlock();
        }
    }

//    With reentrant ocks, you can lock in any part of the location.
    public static void eat() {
        lock.unlock();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter: " + counter);

    }
}
