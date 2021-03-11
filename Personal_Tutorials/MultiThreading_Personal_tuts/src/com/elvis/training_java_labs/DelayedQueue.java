package com.elvis.training_java_labs;


/*
The delayed queue is an implementation of the blocking queue
What is does is, it keep the elements internally, until a certain delay has expired.
An object can be taken out of the queue when the object has expired.
The Delayed Queue is sorted internally, with the longest expired delay first.
 */

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedQueue {
}

class DelayedWorker implements Delayed {
    private long duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public DelayedWorker(long duration, String message) {
        this.duration = duration;
        this.message = message;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.duration < ((DelayedWorker) o).getDuration()){
            return -1;
        }
        if(this.duration > ((DelayedWorker) o).getDuration()){
            return +1;
        }
        return 0;
    }
}
