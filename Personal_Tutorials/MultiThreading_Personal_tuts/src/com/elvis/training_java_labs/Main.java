package com.elvis.training_java_labs;

public class Main {
//    Notes on Multithreading
    /*
    Multithreading: the ability of the CPU to execute multiple processes or threads concurrently
    Process: It is an instance of program execution.
    Every single process has: Registers,program counter,stack memory and heap memory
    Thread: A unit of execution within a given process
    A process may have several threads
    Each thread in a process shares the same memory and resources


    With multi-threading, the time slicing algorithm is used.
    Time-Slicing: The processing time for a single core is shared among processes and threads.
    With 2 threads on 1 process, thread 1 runs for sometime and pause for thread 2 to run after some time
     and cycle continues till the programs are all executed.


     Advantages of MultiThreading:
     1. Responsive applications
     2.Achieve better resource utilization
     3. Improve overall performance

     Disadvantages of MultiThreading
     1. Having to deal with synchronization(cuz threads manipulate data located on the same memory area)
     2. Not easy to design multithreaded applications(making bugs and hard to detect bugs)
     3. Switching between threads is expensive.
     4. It is an expensive operation, shares the same data between threads in a process

     For small problems don't use multi-threading.


     We instantiate a thread with the NEW keyword.
     There are 4 states of a thread:
     1.New: Has start()
     2.Runnable:Thread is executing its task
     3.Waiting: Has the wait() and sleep()
     4.Dead:After a thread finishes its task


     Threads are created by extending the Thread super class.
     we can wait for a thread to finish using the join method

     When a java program starts, then one thread begins running immediately(main thread)
     Becuz threads share the same memory space, we have to deal with synchronization
     Stack Memory: Local variables, Method arguments,method calls
     Heap Memory: Objects


     NB:Stack memory is fast, heap memory is slow
     NB: Stack memory is smaller, heap memory is bigger

     Every thread has its own  stack memory but share the same heap memory
     The main purpose of synchronization is to share resources without interference

     */

    public static void main(String[] args) {
	// write your code here


//        Example of sequential execution in Java
//        Runner_1 r1 = new Runner_1();
//        Runner_2 r2 = new Runner_2();
//        r1.execute();
//        r2.execute();


        //        Example of multithreading  execution not  in Java parallel execution
//        For Runnable
//        Thread t1 = new Thread(new Runner_1());
//        Thread t2 = new Thread(new Runner_2());
//        For Thread
        Thread t1 = new Runner_1();
        Thread t2 = new Runner_2();




//        Alternatively
//        Thread t1 = new Thread(() -> {
//            for(int i=0; i<10; i++) {
//                System.out.println("Runner1: " + i);
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            for(int i=0; i<10; i++) {
//                System.out.println("Runner2: " + i);
//            }
//        });
        t1.start();
        t2.start();

        //        waiting for the thread to finish/die using join().
        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Finished with thread 1");

    }
}
