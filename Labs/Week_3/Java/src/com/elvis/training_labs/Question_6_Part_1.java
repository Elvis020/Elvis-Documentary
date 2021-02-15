package com.elvis.training_labs;

public class Question_6_Part_1 {
    public static void main(String[] args) {
       int min = 1;
       int max = 49;
       int range = max - min;
       int counter = 1;

       while(counter < 7){
           int randy6 = (int) (Math.random() * range) + min;
           counter++;
           if(counter != 7){
               System.out.print(randy6 + ",");
           }else{
               System.out.print(randy6+" ");
           }
       }


//        Using the random generator method
        RandomGenerator(4);
    }

    static void RandomGenerator(int n){
        int min = 1;
        int max = n;
        int range = max - min;
        int luckyNumber = (int) (Math.random() * range) + min;
        System.out.println("Lucky Number is: " + luckyNumber);
    }
}
