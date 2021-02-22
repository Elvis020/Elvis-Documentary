package com.elvis.training_labs_personal;

import java.util.Arrays;

public class ArraysTut {
    public static void main(String[] args) {
        int nums[] = {1,5,3,10,15,0};
        int nums2[] = {1,5,3,10,15,0};
        int nummy[] = {0};
        String names[] = {"Adams","Kelvin","Joe","Nora"};
        //  Sorting the array
//        Arrays.sort(nums);

//        Another way of creating a 1D-array.
//        Arrays.fill(nums, 10);
        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(nummy));
        System.out.println(Arrays.toString(names));


//        Checking if 2 arrays are equal
        System.out.println("Arrays nums and nums2 are equal: " + Arrays.equals(nums, nums2));


//        Copying arrays
        int copyArr[] = Arrays.copyOf(nums2,nums.length);
        int copyArr2[] = Arrays.copyOf(nums2,3);
        System.out.println("Copying all of the nums2 array: " + Arrays.toString(copyArr));
        System.out.println("Copying of the nums2 array: " + Arrays.toString(copyArr2));

//        Binary search to find a given x item
        int result = Arrays.binarySearch(nums, 10);  // Yields the index of the item.
        System.out.println("Searching for 10 yields: " + result);

    }
}

