package com.elvis.training_with_Java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    List<Double> grades1 = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
    List<Double> grades2 = Arrays.asList(10.0,92.9,20.43,2.5,9.0);
    Student Kwame = new Student("Kwame",grades1);
    NaughtyStudent Kwaku = new NaughtyStudent("Kwaku",grades2,Level.LEVEL100);


    @Test
    void getAverageGrade() {
        //        Required Output
        List<Double> grades = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
        NaughtyStudent Hamza = new NaughtyStudent("Hamza",grades,Level.LEVEL100);

        //        Actual Output
        double avgTest = (20.0+30.5+21.5+99.0+22.7) / 5;
        double naughtyAvg = avgTest +( avgTest*0.1);
        assertEquals(naughtyAvg,Hamza.getAverageGrade());
        assertTrue(Hamza instanceof  NaughtyStudent);
//        Use random number for testing
    }



//    Testing if NaughtyStudents is a subclass of Student
    @Test
    void kindOf(){
        assertTrue(Kwaku instanceof Student);
    }
}