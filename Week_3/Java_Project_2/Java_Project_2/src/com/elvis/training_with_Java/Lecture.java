package com.elvis.training_with_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture {

    public List<Double> getArrayOfStudentsGrades() {
        return arrayOfStudentsGrades;
    }
    public Double studentsAvgG;

    private List<Double> arrayOfStudentsGrades = new ArrayList<>();
    private Double studGrade;
    public void  Enter(Student stud){
        studentsAvgG = stud.getAverageGrade();
        arrayOfStudentsGrades.add(studentsAvgG);
    }

    public Double getHighestAverageGrade(){
        Double highestGrade = 0.0;
        for(Double grade : arrayOfStudentsGrades){
            if(grade > highestGrade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }
}
