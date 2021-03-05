package com.elvis.training_java_labs;
// Implementing Runnable
//class Runner_2 implements Runnable{
//    @Override
//    public void run() {
//        for(int i=0; i<10; i++) {
//            System.out.println("Runner2: " + i);
//        }
//    }
//}
//
//class Runner_1 implements Runnable{
//    @Override
//    public void run() {
//        for(int i=0; i<10; i++) {
//            System.out.println("Runner1: " + i);
//        }
//    }
//}
//


//Extending thread
class Runner_1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            try{
                Thread.sleep(100);
            }catch(InterruptedException ei){
                ei.printStackTrace();
            }
            System.out.println("Runner1: " + i);
        }
    }
}

class Runner_2 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ei){
                ei.printStackTrace();
            }
            System.out.println("Runner2: " + i);
        }
    }
}
