package com.elvis.training_labs;

public class Question_4_Part_1 {
    public static void main(String[] args) {

//        (Do While_Loop)
        int min = -3;
        int max = 3;
        int randy3 = 1;
        int range = max - min;
//        do{
//            randy3 = (int) (Math.random() * range) + min;
//            System.out.print(randy3+",");
//        }while(randy3 != 0);


//        OR(While_Loop)

        while(randy3 != 0){
            randy3 = (int) (Math.random() * (max - min)) + min;
            System.out.print(randy3+",");
        }

    }
}
