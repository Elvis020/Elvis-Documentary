package com.elvis.training_with_Java;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> listOfBags = new ArrayList<>();
    public void add(T t){
        listOfBags.add(t);
    }
    public void remove(T t){
        listOfBags.remove(t);
    }
    public void clear(T t){
        listOfBags.clear();
    }
}
