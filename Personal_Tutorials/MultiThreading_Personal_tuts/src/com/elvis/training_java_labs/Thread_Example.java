package com.elvis.training_java_labs;

public class Thread_Example {
    /*
    The child threads are created from the main thread begins
    The main thread is the last thread to finish execution because
    it performs various shutdown operations.


    Daemon threads(DTs): They are helper threads.Eg Garbage collection(GC)
    *Worker threads(WTs) are created from the main threads
    DTs are low priority threads that runs in background to perform tasks such as GC
    When all other WTs are terminated, daemon threads are terminated by the JVM



    Main difference between a daemon thread and a worker thread
    WTs are not terminated when DTs are interrupted
     */
//    Creating the Worker Thread class
//    static class Worker implements Runnable{
//        @Override
//        public void run() {
//            System.out.println("Hello world from a given thread.");
//            String name1 = Thread.currentThread().getName();
//            System.out.println(name1);
//        }
//    }

    static class DaemonT implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Daemon thread is running.............");
            }
        }
    }

    static class NormalWorkerT implements Runnable {
        @Override
        public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Normal thread finishes execution.............");

        }
    }


    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        System.out.println(name);

        Thread dt = new Thread(new DaemonT());
        Thread nw = new Thread(new NormalWorkerT());
//        wt.start();
        dt.setDaemon(true);
        dt.start();
        nw.start();


    }
}
