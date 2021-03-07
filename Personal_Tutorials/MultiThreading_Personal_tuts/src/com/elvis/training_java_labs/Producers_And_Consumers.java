package com.elvis.training_java_labs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
NB:When the notify() is called, it does other operations.
 */

class Processor{
    List<Integer> newList = new ArrayList<>();
    private static  final int upper_limit = 5;
    private static  final int lower_limit = 0;
    private static Object lock = new Object();
    private static Lock locky = new ReentrantLock();
    private int value = 0;

//    Using syncnhronzd locks
    public void producer() throws InterruptedException{
        synchronized (lock){
            while(true){
                if(newList.size() == upper_limit){
                    System.out.println("Waiting for removing items: ");
                    lock.wait();
                }else{
                    System.out.println("Adding: " + value);
                    newList.add(value);
                    value++;
                    lock.notify();//Other thread willl be notified only if it is in the waiting
                    // state
                }
                Thread.sleep(500);
            }
        }

    }
    public void consumer() throws InterruptedException{
        synchronized (lock){
            while(true){
                if(newList.size() == lower_limit){
                    System.out.println("Waiting for adding items: ");
                    value = 0;
                    lock.wait();
                }else{
                    System.out.println("Removing: " + newList.remove(newList.size() - 1));
                    lock.notify();//Other thread will be notified only if it is in the waiting
                    // state
                }
                Thread.sleep(500);
            }
        }
    }



}


public class Producers_And_Consumers {
    public static void main(String[] args) {
        Processor ps = new Processor();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    ps.producer();
                }catch(InterruptedException ei){
                    ei.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    ps.consumer();
                }catch(InterruptedException ei){
                    ei.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
