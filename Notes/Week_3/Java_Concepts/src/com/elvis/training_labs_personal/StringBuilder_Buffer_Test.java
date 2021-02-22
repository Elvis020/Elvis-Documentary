package com.elvis.training_labs_personal;

public class StringBuilder_Buffer_Test {
    public static void main(String[] args) {


        /**
         * StringBuffer
         */
        StringBuffer sb1 = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for(int i=0; i < 1000000; i++){
            sb1.append("Java");
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration of the StringBuffer's running is: " + duration + " milliSecond");
        /**
         * StringBuilder
         */
        StringBuffer sb2 = new StringBuffer();
        long startTime2 = System.currentTimeMillis();
        for(int i=0; i < 1000000; i++){
            sb2.append("Java");
        }
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        System.out.println("Duration of the StringBuilder's running is: " + duration2 + " milliSecond");

    }
}
