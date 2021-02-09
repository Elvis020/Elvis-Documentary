package com.elvis.training_labs_personal;

import java.util.Arrays;

public class ArraysTut2 {
    public static void main(String[] args) {
        int nummy[] = {1,2,3,4,5};
        modify(nummy);
//        anonymous arrays
        modify(new int[]{1,2,3});
        System.out.println(Arrays.toString(nummy));
    }

    static void modify(int num[]) {
        for(int i=0;i<num.length;i++){
            num[i] *= 10;
        }
    }
}
