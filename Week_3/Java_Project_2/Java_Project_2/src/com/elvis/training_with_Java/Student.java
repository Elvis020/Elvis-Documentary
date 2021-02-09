package com.elvis.training_with_Java;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable,HasLevel {
    public  List<Double> listOfStudentGrades;
    private Level studentLevel;




    private String nameOfStudent;
    public Student(List<Double> listOfStudentGrades) {
        this.listOfStudentGrades = listOfStudentGrades;
    }

    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public Student(String nameOfStudent,List<Double> listOfStudentGrades) {
        this.listOfStudentGrades = listOfStudentGrades;
        this.nameOfStudent = nameOfStudent;
    }
    public Student(String nameOfStudent,List<Double> listOfStudentGrades,Level studentLevel) {
        this.listOfStudentGrades = listOfStudentGrades;
        this.nameOfStudent = nameOfStudent;
        this.studentLevel = studentLevel;
    }

    public Double getAverageGrade(){
        double start = 0.0;
        for(Double d : listOfStudentGrades){
            start +=  d;
        }
        return start/listOfStudentGrades.size();
    }

    @Override
    public String getName() {
        return this.nameOfStudent;
    }

    @Override
    public Level getLevel() {
        return this.studentLevel;
    }
}
