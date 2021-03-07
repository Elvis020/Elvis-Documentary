package com.elvis.training_java_labs;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable{
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("🥴 Task with id "+id+" is in work - thread id: "+Thread.currentThread().getName());
        long duration = (long) (Math.random() * 5);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




public class SingleThreadExecutor {
    public static void main(String[] args) {
//        Creating executor service of type single thread execution
//        A single thread wil execute the task sequentially.i.e one after the other
        ExecutorService es = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            es.execute(new Task(i));
        }
//        Remember to shutdown the executor

    }
}
