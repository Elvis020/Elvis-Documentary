package com.elvis.training_labs;

public class Question_5_Part_1 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1; i<11; i++){
            System.out.println("**********");
            for(int j=1; j<13; j++){
                System.out.println(j + " X " + i + " = " + i*j);
            }
        }
    }
}
