package com.elvis.training_java_labs;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
With reentrant locks we us ethe await() and signal() in place of wait() and notify()
 */

class Worker{
//    private static Lock lockKey;
    private static Lock lockKey = new ReentrantLock();
    private static Condition con = lockKey.newCondition();

    public static void producer() throws InterruptedException{
        lockKey.lock();
        System.out.println("Producer method...🤪");
        con.await();
        System.out.println("Producer method again...🤪");
        lockKey.unlock();

    }
    public static void consumer() throws InterruptedException{
        lockKey.lock();
        Thread.sleep(2000);
        System.out.println("Consumer method...🥴");
        con.signal();
        lockKey.unlock();
    }
}


public class Re_EntrantLocks_Advanced {
    public static void main(String[] args) {
        Worker w = new Worker();
        Thread new_t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    w.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread new_t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    w.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        new_t1.start();
        new_t2.start();

        try {
            new_t1.join();
            new_t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
