package com.elvis.training_java_labs;
/*
    Java provides its own multi-threading framework, and its called the Executor Framework
    With the help of this framework, we can manage worker threads more efficiently because of
    thread pools.🥴


    WHy use the thread pools and the executor frameworks
    -It will handle everything:schedule and execute the submitted tasks in
    -creating and managing threads is expensive,


    Thread pools help with the management of threads by reusing threads instead of creating them.
    Thread pools are usually queues
    Using thread poos makes multithreading efficient



    There are several types of executors:
    -SingleThreadExecutor
    -FixedThreadPool(n)
    -CachedThreadPool
    -ScheduledExecutor

    SingleThreadExecutor: Has a single thread, so we can execute process in a sequentil manner.
                           Every process is executed by a new thread.
    FixedThreadPool: This is how we can create a thread pool with n threads. n is usually the
                    number of cores on the CPU.
                    If there are more tasks than n, then these tasks are stored with a
                    LinkedBlockingQueue data structure.
   CachedThreadPool: Here, the number of threads is unbounded.i.e if all threads are busy and a
                    new task comes, the pool will create and add a new thread to the executor.
                    If a thread is idle for 60sec, it s removed.
                    It is used for sort parallel tasks.
   ScheduledExecutor: For executing an operation at regular intervals or if we wish to delay a
                      certain task.
 */

public class Executors_Notes {
}
