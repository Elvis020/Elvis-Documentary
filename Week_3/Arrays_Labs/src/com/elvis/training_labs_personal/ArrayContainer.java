package com.elvis.training_labs_personal;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayContainer {
    int arraySize;

    public ArrayContainer(int arraySize) {
        this.arraySize = arraySize;
        getElementsOfArray();
        System.out.println(getElementsOfArray());
    }
    public List<Integer> getElementsOfArray(){
        return Stream.iterate(1, x ->x+1)
                .limit(arraySize)
                .collect(Collectors.toList());
    }

}
