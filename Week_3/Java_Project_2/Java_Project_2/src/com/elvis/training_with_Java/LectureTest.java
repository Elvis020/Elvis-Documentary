package com.elvis.training_with_Java;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    List<Double> grades1 = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
    List<Double> grades2 = Arrays.asList(10.0,92.9,20.43,2.5,9.0);
    List<Double> grades3 = Arrays.asList(70.0,12.9,31.3,29.5,39.0);
    List<Double> grades4 = Arrays.asList(2.0,82.9,20.1,2.54,79.0);
    Student Kwame = new Student("Kwame",grades1);
    Student Kwaku = new Student("Kwaku",grades2);

    @Test
    void getHighestAverageGrade() {
//        Required Test
        Double kGrade = Kwame.getAverageGrade();
        Double kwGrade = Kwaku.getAverageGrade();
        Double HighestAvg;
        if(kGrade>kwGrade){
            HighestAvg= kGrade;
        }else{
            HighestAvg= kwGrade;
        }
//        Actual Test
        Lecture lec = new Lecture();
        lec.Enter(Kwame);
        lec.Enter(Kwaku);
        lec.getHighestAverageGrade();

        assertEquals(HighestAvg,lec.getHighestAverageGrade());

    }


    @Test
    public void NaughtyStudent(){

        //        Required Output
        List<Double> grades = Arrays.asList(20.0,30.5,21.5,99.0,22.7);
        NaughtyStudent KwakuNaughty = new NaughtyStudent("KwakuNaughty",grades,Level.LEVEL100);
        Student Elvis = new Student("Elvis",grades);
        //        Actual Output
        double avg = (20.0+30.5+21.5+99.0+22.7) / 5;
        double nAvg = avg + (avg*0.1);
        Lecture lec2 = new Lecture();
        lec2.Enter(KwakuNaughty);
        lec2.Enter(Elvis);
        assertEquals(nAvg,lec2.getArrayOfStudentsGrades().get(0));

//        Testing to show that NaughtyStudents are scoring higher than they should
    }
}