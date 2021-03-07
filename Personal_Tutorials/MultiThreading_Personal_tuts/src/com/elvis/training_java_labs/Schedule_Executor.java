package com.elvis.training_java_labs;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class StockMarketUpdater implements Runnable{

    @Override
    public void run() {
        System.out.println("🕸️ Updating and downloading stock related data from the web ... 🕸️ " +
                "using " + Thread.currentThread().getName());
    }
}

public class Schedule_Executor {
    public static void main(String[] args) {
//        A scheduled thread pool for instances like this, where we want stock market information
//        in intervals.
        ScheduledExecutorService sec = Executors.newScheduledThreadPool(1);
        sec.scheduleAtFixedRate(new StockMarketUpdater(),1000,2000, TimeUnit.MILLISECONDS);

    }
}
