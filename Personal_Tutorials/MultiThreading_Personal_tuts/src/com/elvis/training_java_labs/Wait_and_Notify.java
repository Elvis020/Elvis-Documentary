package com.elvis.training_java_labs;

/*


A thread cannot acquire a lock owned by another thread.
Allowing a thread to acquire the same lock more than once is
called re-entrant synchronization.


The wait() and notify() are to signal the threads to release locks
The wait() releases the lock for the other thread to resume operations
and the other thread uses the notify() to tell the previous thread that it is done.




Difference between wait and sleep
1.you call wait on the Object while on the other hand
    you call sleep on the Thread itself
2. wait can be interrupter (this is why we need the InterruptedException)
    while on the other hand sleep can not
3. wait (and notify) must happen in a synchronized  block on the monitor
    object whereas sleep does not
4. sleep operation does not release the locks it holds while on the other
    hand wait releases the lock on the object that wait() is called on
 */
class Process{
    public void produce() throws InterruptedException {
//        synchronized(this) - gives you the intrinsic lock on the Process
        synchronized (this) {
            System.out.println("Running the produce method!");
            wait();
            System.out.println("Again in the produce method.");
        }

    }

    public void consume() throws InterruptedException {

        Thread.sleep(1000);
        synchronized (this) {
            System.out.println("Consume method is executed!");
            notify();
        }
    }
}




public class Wait_and_Notify {
    public static void main(String[] args) {
        Process p = new Process();
        Thread t1 = new Thread(new  Runnable() {
            @Override
            public void run() {
                try {
                    p.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new  Runnable() {
            @Override
            public void run() {
                try {
                    p.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
