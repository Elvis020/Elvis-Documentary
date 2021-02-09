package com.elvis.training_labs_personal;

public class StrngManipulation {
    public static void main(String[] args) {
        String s = "this&is&going&to&be&splitted";
        String[] str = s.split("&",6);
        for(String n : str){
            System.out.print(n+" ");
        }
    }
}
