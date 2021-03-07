package com.elvis.training_java_labs;

/*
Every read of the volatile keyword is read from the RAM(main memory) and not the cache since each
 thread has its own cache.
 That is why we use he volatile keyword when dealing with threads
 Usually,variables are cached to improve performance
 So when we use the volatile keyword , performance is very low...unless its very necessary to
 use the volatile keyword, don't !!!!!


 Adding volatile means that, the variable associated with it won't be cached as usual, but it
 would be stored in the main memory.
 */


class WorkerClass implements Runnable{
    private volatile boolean terminated;
    @Override
    public void run() {
        while(!terminated){
            System.out.println("Working class is running");
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isTerminated() {
        return terminated;
    }

    public void setTerminated(boolean terminated) {
        this.terminated = terminated;
    }
}

public class VolatileKeywordTut {
    public static void main(String[] args) {
        WorkerClass wc2 = new WorkerClass();
        Thread t1 = new Thread(wc2);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wc2.setTerminated(true);
        System.out.println("Worker class has been terminated!");
    }
}
