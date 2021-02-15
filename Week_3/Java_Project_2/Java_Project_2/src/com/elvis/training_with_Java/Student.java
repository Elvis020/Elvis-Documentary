package com.elvis.training_with_Java;

import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Nameable,HasLevel {
      List<Double> listOfStudentGrades;
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

    public Student checkStatus(Student student){
        return student;
    }

    public Double getAverageGrade(){
        double start = 0.0;
        for(Double d : listOfStudentGrades){
            start +=  d;
        }
        return start/listOfStudentGrades.size();
    }

    public DoubleStream gradesOfStudent(){
        return listOfStudentGrades.stream().mapToDouble(g -> g);
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


