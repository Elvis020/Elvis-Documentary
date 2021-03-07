package com.elvis.training_java_labs;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

class Worker_Processor implements Callable<String> {
    private int id;

    public Worker_Processor(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "id "+ id + " " + Thread.currentThread().getName();
        //Futures are used to return values from a given thread.
    }
}

public class Callable_Example {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        List<Future<String>> arrList = new ArrayList<>();

        for(int i=0;i<5;i++){
            Future<String> myFuture =  es.submit(new Worker_Processor(i+1));
            arrList.add(myFuture);
        }

        for(Future<String> i : arrList){
            try {
                System.out.println(i.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        es.shutdown();
    }
}
