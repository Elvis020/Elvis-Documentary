package com.elvis.training_java_labs;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
To deal with deadlocks, you need more than 1 reentrant locks
Eliminate deadlocks by eliminating cyclic dependencies
 */

public class Deadlock {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        Deadlock dl= new Deadlock();
        new Thread(dl::worker1,"worker 1").start();
        new Thread(dl::worker2,"worker 2").start();

    }


    public void worker1(){
        lock1.lock();
        System.out.println("🤣 worker1 acquires the lock1... 🤣");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock2.lock();
        System.out.println("🤯 worker1 acquires the  lock2... 🤯");
        lock1.unlock();
        lock2.unlock();
    }
    public void worker2(){
        lock1.lock();
        System.out.println("worker2 has acquired the lock1...");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock2.lock();
        System.out.println("worker2 has acquired the lock2...");
        lock2.unlock();
        lock1.unlock();
    }
}



















