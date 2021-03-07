package com.elvis.training_java_labs;

/*
So semaphores basically restrict or manage access to resources
and it just keeps a count of the number of access available.
Semaphore maintains a set of permits
Semaphore has 2 methods: acquire() and release()
acquire(): this gives a thread a permit if it is available, there by reducing the permit count
release(): this is when a thread is done with its task and makes it available there by increasing
 the permit
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

enum Downloader{
    INSTANCE;
    private int count = 1;
    private Semaphore sp = new Semaphore(3, true);
    public void downloadData(){
        try {
            sp.acquire();
            download();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            sp.release();
        }
    }

    private void download() {
        System.out.println(count + "Downloading data from the web....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }
}



public class Semaphore_Example {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i=0; i<12;i++){
            es.execute(new Runnable() {
                @Override
                public void run() {
                    Downloader.INSTANCE.downloadData();
                }
            });
        }
    }
}
