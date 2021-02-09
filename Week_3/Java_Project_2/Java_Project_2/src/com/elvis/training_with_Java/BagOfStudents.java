package com.elvis.training_with_Java;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents<Student> {
    List<Student> listOfBagsOfStudents = new ArrayList<>();
    public void add(Student student){
        listOfBagsOfStudents.add(student);
    }
    public void remove(Student student){
        listOfBagsOfStudents.remove(student);
    }
    public void clear(Student student){
        listOfBagsOfStudents.clear();
    }
}
