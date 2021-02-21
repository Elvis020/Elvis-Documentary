package com.elvis.training_with_Java;

import java.util.Comparator;

public class OrderByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLevel().compareTo(o2.getLevel());
    }
}
