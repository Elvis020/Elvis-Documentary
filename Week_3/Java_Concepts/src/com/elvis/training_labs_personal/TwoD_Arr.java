package com.elvis.training_labs_personal;

public class TwoD_Arr {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        int nums2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int nums3[][] = {{1,2,3,5},{4,5},{7,8,9}};
//        First Matrix
        System.out.println("**** 3-by-4 Matrix *****");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = i+j;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("**** 3-by-3 Matrix *****");
//        Second Matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                nums2[i][j] = i+j;
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println();
        }


        //        Thrid Matrix
        System.out.println("**** Jagged Matrix *****");
        for(int n[] : nums3){
            for(int num : n){
                System.out.print(num+ " ");
            }
            System.out.println();
        }




    }
}
