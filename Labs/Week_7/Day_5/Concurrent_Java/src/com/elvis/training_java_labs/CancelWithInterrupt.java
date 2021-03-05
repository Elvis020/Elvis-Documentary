package com.elvis.training_java_labs;

public class CancelWithInterrupt {
    public void startOp(){
        Thread hello = new Thread(() -> {
//            Atom
            while(!Thread.interrupted()){
                System.out.println("Hello");
//                System.out.println(Thread.currentThread().isInterrupted()); 
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ie){return;}
            }
        });
        hello.start();
        try {
            Thread.sleep(5000);
            hello.interrupt();
        }catch(InterruptedException e){}
    }
}
