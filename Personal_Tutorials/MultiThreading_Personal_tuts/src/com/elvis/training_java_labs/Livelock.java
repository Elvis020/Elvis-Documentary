package com.elvis.training_java_labs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Livelock {
    private Lock lock__1 = new ReentrantLock(true);
    private Lock lock__2 = new ReentrantLock(true);
    public static void main(String[] args) {
        Livelock ll = new Livelock();
//        After Java 8 it is possible to create threads like this.
        new Thread(ll::worker_l1, "worker l1").start();
        new Thread(ll::worker_l2, "worker l2").start();
    }


    public void worker_l1(){
        while(true) {
            try {
                lock__1.tryLock(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 1 acquires lock__1");
            System.out.println("Worker 1 tries to acquire lock__2");
            if(lock__2.tryLock()){
                System.out.println("Worker 1 acquires lock__2");
                lock__2.unlock();
            }else{
                System.out.println("Worker 1 could not acquire lock__2");
                continue;
            }
            break;
        }
        lock__1.unlock();
        lock__2.unlock();
    }
    public void worker_l2(){
        while(true){
            try{
                lock__2.tryLock(50, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 has acquired lock__2");
            System.out.println("Worker 2 is trying to acquire lock__1");
            if(lock__1.tryLock()){
                System.out.println("Worker 2 has now acquired lock__1");
                lock__1.unlock();
            }else{
                System.out.println("Worker 2 failed to acquire lock__1");

                continue;
            }
            break;
        }
        lock__1.unlock();
        lock__2.unlock();
    }
}
