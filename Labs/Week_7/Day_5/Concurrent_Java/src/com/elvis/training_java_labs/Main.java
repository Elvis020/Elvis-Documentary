package com.elvis.training_java_labs;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Thread t1 = new Thread(new TikTok("tick",50));
//        Thread t2 = new Thread(new TikTok("tock",100));
////        Creating a thread...that works until interrupted
//        t1.start();
//        t2.start();

        CancelWithInterrupt try1 = new CancelWithInterrupt();
        try1.startOp();
//        CancelWithFlag try2 = new CancelWithFlag();
//        try2.startFlagOp();


    }
}
