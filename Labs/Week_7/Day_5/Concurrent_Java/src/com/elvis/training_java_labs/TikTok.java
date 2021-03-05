package com.elvis.training_java_labs;

public class TikTok implements Runnable {
    private String word;
    private int delay;

    public TikTok(String word, int delay) {
        this.word = word;
        this.delay = delay;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()){
            try {
                System.out.println(word + " ");
                Thread.sleep(delay);
            }catch(InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
