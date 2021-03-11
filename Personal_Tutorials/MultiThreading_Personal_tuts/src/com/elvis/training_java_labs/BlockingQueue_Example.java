package com.elvis.training_java_labs;


/*
Blocking Queue is an interface that supports thread safe-queues.
We are able to implement the producer -consumer pattern with the help of the blocking queue
With blocking queue, one thread puts item into the queue and another thread takes items from it
at the same time.
 */


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BQ_Worker_1 implements Runnable{
    private BlockingQueue<Integer> bq1;

    public BQ_Worker_1(BlockingQueue<Integer> bq) {
        this.bq1 = bq1;
    }

    @Override
    public void run() {
        int counter = 0;
        while(true){
            try {
                bq1.put(counter);
                System.out.println("Putting items in the queue: "+counter);
                counter++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class BQ_Worker_2 implements Runnable{
    private BlockingQueue<Integer> bq2;

    public BQ_Worker_2(BlockingQueue<Integer> bq) {
        this.bq2 = bq2;
    }

    @Override
    public void run() {
        while(true){
            try {
                int number = bq2.take();
                System.out.println("Taking item from the queue: "+number);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class BlockingQueue_Example {
    public static void main(String[] args) {
        BlockingQueue<Integer> bqq = new ArrayBlockingQueue<>(10);
        BQ_Worker_1 bqq1 = new BQ_Worker_1(bqq);
        BQ_Worker_2 bqq2 = new BQ_Worker_2(bqq);

        new Thread(bqq1).start();
        new Thread(bqq2).start();
    }
}
