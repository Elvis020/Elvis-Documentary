package com.elvis.training_java_labs;

/*
    Semaphores were invented by Dijkstra
    Semaphores are simple variables that are used for controlling access to a common resource.
    There are two types of semaphores:
    Counting Semaphores and Binary Semaphores

    * Semaphores track only how many resources are fee
    * The Semaphores count may serve as a useful trigger for a number of different actions
    Eg. the medium subscribe trigger after reading 5 articles.
    * The semaphore solves the producer-consumer problem(Dijkstra's approach)


    * Mutexes(Mutual Exclusion Objects): Its a property of concurrency control which is
    instituted for the purpose of preventing race conditions

    * Race Condition: When multiple threads are trying to use the same resource.
    * Mutex is very similar to a binary semaphore
    * A Lock is basically a mutex


    Difference between semaphores and mutexes
    * Semaphore allows multiple programs threads to access the finite instance of the resource
    while mutex allows multiple program threads to access a single shared resiurce but one at a
    time.

    * With semaphores, the thread blocks itself if no resource is free whiles with mutex, if the
    lock is already acquired by another thread, it waits.
 */

public class Semaphores_and_Mutexes {
}
