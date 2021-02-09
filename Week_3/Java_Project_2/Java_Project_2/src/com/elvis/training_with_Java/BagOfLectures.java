package com.elvis.training_with_Java;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures<Lecture> {
    List<Lecture> listOfBagsOfLectures = new ArrayList<>();
    public void add(Lecture lecture){
        listOfBagsOfLectures.add(lecture);
    }
    public void remove(Lecture lecture){
        listOfBagsOfLectures.remove(lecture);
    }
    public void clear(Lecture lecture){
        listOfBagsOfLectures.clear();
    }
}
