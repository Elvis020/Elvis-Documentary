package com.elvis.training_java_labs;

import java.util.concurrent.atomic.AtomicBoolean;

public class CancelWithFlag {
            public AtomicBoolean bool_to_check_condition = new AtomicBoolean(true);
    public void startFlagOp(){
        Thread hello = new Thread(() -> {
            while(bool_to_check_condition.get()){
                System.out.println("Hello");
                try{
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
//                    return;
                }
            }
        });
        hello.start();
        try {
            Thread.sleep(5000);
            bool_to_check_condition.compareAndSet(true,false);
        }catch(InterruptedException e){}
    }
}
