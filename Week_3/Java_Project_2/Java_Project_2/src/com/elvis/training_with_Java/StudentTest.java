package com.elvis.training_with_Java;

import org.junit.jupiter.api.Test;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class StudentTest {
    List<Double> grades1 = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
    List<Double> grades2 = Arrays.asList(10.0,92.9,20.43,2.5,9.0);

    Student Kwaku = new Student("Kwaku",grades2,Level.LEVEL100);
    Student Ama = new NaughtyStudent("Ama",grades2,Level.LEVEL100);


    @Test
    void getAverageGrade() {

        //        Required Output
        List<Double> grades = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
        Student Elvis = new Student("Elvis",grades);
        //        Actual Output
        double avgTest = (20.0+30.5+21.5+99.0+22.7) / 5;
//        Testing for the average Grades
        assertEquals(avgTest,Elvis.getAverageGrade());
    }


    @Test
    void getName() {
        //        Testing for Student name
        List<Double> grades = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
        Student Elvis = new Student("Elvis",grades);
        assertEquals("Elvis",Elvis.getName());
    }

//    @Test
//    void checkStatus() {
//        Kwaku.checkStatus(Kwaku);
//        Ama.checkStatus(Ama);
////        assertEquals(Kwaku.checkStatus(Kwaku),);
//    }
}