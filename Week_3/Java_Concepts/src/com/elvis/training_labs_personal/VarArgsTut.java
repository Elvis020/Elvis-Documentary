package com.elvis.training_labs_personal;

public class VarArgsTut {
    public static void main(String[] args) {
        sum("Ama",2,3,4,4,7,9);
    }



//    to use ... arguments(vararguments), they are always on the last part of the function argument argument.
    public static void sum(String name,int ... nums){
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
        }
        System.out.println("The result is " + sum + " and the name is: " + name);
    }
}
