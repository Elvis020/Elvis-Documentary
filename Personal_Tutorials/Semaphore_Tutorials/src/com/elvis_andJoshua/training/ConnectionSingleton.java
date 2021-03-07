package com.elvis_andJoshua.training;

import java.util.concurrent.Semaphore;

//Creating a singleton
enum ConnectionSingleton {
    INSTANCE;
    private int connections = 0;
    private Semaphore sm2 = new Semaphore(10);
//    When you set the fairness to true, then whichever is first to acquire a permit will be the
//    first to get one if it becomes available.

//    In case there is an interrupt exception, the sm2.release() will never be reached!
    public void connect(){
        try {
            sm2.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{
            doConnect();
        }finally {
            sm2.release();
        }
    }

    public void doConnect(){
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this){
            connections++;
            System.out.println("Current connections: " + connections);
        }

//        synchronized (this){
//            connections--;
//            System.out.println("Connections reduced!, connections: " + connections);
//        }

    }
}
