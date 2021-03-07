package com.elvis.training_java_labs;
/*
Atomic variables are used to deal with multi-threading issues
Atomic variables use low-level synchronization inorder to keep he threads in the same state
 */

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_Variables {
    private static AtomicInteger counter= new AtomicInteger(0);
    public static void main(String[] args) {
        Atomic_Variables av = new Atomic_Variables();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment_AV();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment_AV();
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
        System.out.println("Counter: "+ counter);
    }

//    Using the synchronized solution
//    public synchronized static void increment_AV(){
//        for(int i=0; i<1000000;i++)
//            counter++;
//    }

//    Using the atomic variables solution
    public  static void increment_AV(){
        for(int i=0; i<1000000;i++)
            counter.getAndIncrement();
    }
}
