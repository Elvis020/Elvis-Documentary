package com.elvis.training_labs_personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayContainer2 {

    public ArrayContainer2() {
        System.out.println(getElementsOfArray2());
    }
    public ArrayList<Integer> getElementsOfArray2(){
        return (ArrayList<Integer>) new Random().ints(10, 1, 49)
                .sorted()
                .distinct()
                .limit(6)
                .boxed()
                .collect(Collectors.toList());
    }

}
