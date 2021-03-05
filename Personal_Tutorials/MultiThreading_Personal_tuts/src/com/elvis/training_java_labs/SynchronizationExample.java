package com.elvis.training_java_labs;

/*
When the synchronized keyword is used, it makes sure the method
can be accessed by a single thread one at a time
(this is the work of the intrinsic lock)
Every java object has an intrinsic-lock and this is a problem

NB: Becuz of the lock, no two threads can execute the synchronized
method at the same time


Because the SynchronizationExample object has a single lock,
the methods cannot be executed at the same time

Object level Locking and Class level Locking

 */

public class SynchronizationExample {
//    Using object locks
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static int counter1 = 0;
    public static int counter2 = 0;

//    Making sure this method is executed be only one thread at a given time.
//    public static synchronized void increment1(){counter1++;} //This is not a good programming practice
//    public static void increment1(){
//        synchronized(SynchronizationExample.class){counter1++;}
//    } //This is  a good programming practice

//    Using the object lock
    public static void increment1(){
        //        Object level locking using synchronized blocks
        synchronized(lock1){counter1++;}
    }

//    public static void increment2(){
////        Class level locking using synchronized blocks
//        synchronized(SynchronizationExample.class){counter2++;}
//    } //This is  a good programming practice
    public static void increment2(){
//        Object level locking using synchronized blocks
        synchronized(lock2){counter2++;}
    } //This is  a good programming practice


    public static void process(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i <100; ++i){
                    increment1();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i <100; ++i){
                    increment2();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch(InterruptedException eii){
            eii.printStackTrace();
        }
        System.out.println("The counter1 is: " + counter1);
        System.out.println("The counter2 is: " + counter2);
    }

    
    
    public static void main(String[] args) {
        process();
    }
}
