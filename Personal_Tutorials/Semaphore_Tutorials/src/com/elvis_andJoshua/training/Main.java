package com.elvis_andJoshua.training;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Semaphore sm = new Semaphore(2);
//
////        To increase the number of available permits, use the release method and use acquire ti
////        decrease the number of available permits
//        sm.release();
//        sm.acquire();
//
////        acquire and release methods behave like a lock
//
//        System.out.println("Available permits: " + sm.availablePermits());


//        Creating an executor service
        ExecutorService es  = Executors.newCachedThreadPool();
        for(int i=0; i<200;i++){
            es.submit(new Runnable() {
                @Override
                public void run() {
                    //        Testing the singleton enum
                    ConnectionSingleton.INSTANCE.doConnect();
                }
            });
        }

        es.shutdown();
        es.awaitTermination(1, TimeUnit.SECONDS);



    }
}
