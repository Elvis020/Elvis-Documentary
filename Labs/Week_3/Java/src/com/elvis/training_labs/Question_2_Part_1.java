package com.elvis.training_labs;

public class Question_2_Part_1 {
    public static void main(String[] args) {
        int randy = (int) (Math.random() * 100);
//        Even and Odd
//        if(randy % 2 ==0){
//            System.out.println("Randy is even: " + randy);
//        } else{
//            System.out.println("Randy is odd: " + randy);
//        }
        if(randy == 0){
            System.out.println("frozen: "+ randy);
        }else if(randy >= 1 && randy <=14){
            System.out.println("cold: "+ randy);
        }else if(randy >= 15 && randy <=24){
            System.out.println("cool: "+ randy);
        }else if(randy >= 25 && randy <=40){
            System.out.println("warm: "+ randy);
        }else if(randy >= 41 && randy <=60){
            System.out.println("hot: "+ randy);
        }else if(randy >= 61 && randy <=80){
            System.out.println("very hot: "+ randy);
        }else if(randy >= 81 && randy <=99){
            System.out.println("extremely hot: "+ randy);
        }else if(randy == 100){
            System.out.println("boiling");
        }
    }
}
