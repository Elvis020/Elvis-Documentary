package com.elvis.training_java_labs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Work implements Runnable{
    private int id;

    public Work(int id) {
            this.id = id;
        }

    @Override
    public void run() {
            System.out.println("🥴 Task with id "+id+" is in work - thread id: "+Thread.currentThread().getId());
            long duration = (long) (Math.random() * 5);
            try {
                TimeUnit.SECONDS.sleep(duration);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                }
            }
    }

public class FixedThreadExample {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++){
            es.execute(new Work(i+1));
        }
//        First prevent the exector from executing any further tasks
        es.shutdown();
//        Next, we terminate running tasks
        try {
            if(!es.awaitTermination(1000, TimeUnit.MILLISECONDS)){
//                Terminates the executor service even if the tasks are not done
//                es.shutdownNow();
            }
        }catch (InterruptedException ei){
            es.shutdownNow();
        }
    }

}
