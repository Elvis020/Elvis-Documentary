package com.elvis.training_java_labs;

/*
Cyclic Barrier: Used in  situations where you want to create a group of taks to perform work in
parallel + wait until they are finished.
Cyclic Barrier can be reused over and over again.
 */

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker_CB implements Runnable{
    private int id;
    private CyclicBarrier cb;
    private Random rd;

    public Worker_CB(int id, CyclicBarrier cb) {
        this.id = id;
        this.cb = cb;
        this.rd = new Random();
    }

    @Override
    public void run() {
        doWork();
    }

    private void doWork(){
        System.out.println("Thread with id: " + id + " starts the task");
        try {
            Thread.sleep(rd.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread with id: "+ id+" finished!");


        try {
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Worker_CB{" +
                "id=" + id +
                ", cb=" + cb +
                ", rd=" + rd +
                '}';
    }
}

public class Cyclic_Barrier_Example {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("All the threads are finished!");
            }
        });
        for(int i=1;i<6;i++){
            es.execute(new Worker_CB(i,barrier));
        }
        es.shutdown();

    }
}
