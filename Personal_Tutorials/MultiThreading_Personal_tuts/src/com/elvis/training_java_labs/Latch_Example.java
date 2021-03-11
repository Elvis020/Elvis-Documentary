package com.elvis.training_java_labs;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Latch_Example {

    /*
    [Latch]
* This is used to synchronize one or ore tasks by fircing them to wait for the completion of a set
of operations being performed by other tasks

* Example: You may want to trigger something after 10000 users download an image.

* A countdown latch cannot be reset.
* Multiple threads can wait if we use the countdown latch
     */
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(5);
        for(int i=0;i<5;i++){
            es.execute(new WorkerLatch(i+1,latch));
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All the prerequisites are done...");
        es.shutdown();


    }
}


class WorkerLatch implements Runnable{
    private int id;
    private CountDownLatch cdl;

    public WorkerLatch(int id, CountDownLatch cdl) {
        this.id = id;
        this.cdl = cdl;
    }

    @Override
    public void run() {
        doWork();
       cdl.countDown();
    }

    public void doWork(){
        System.out.println("Thread with id: " + this.id + " starts working...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
