package com.elvis.training_with_Java;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(String nameOfStudent, List<Double> listOfStudentGrades, Level studentLevel) {
        super(nameOfStudent, listOfStudentGrades, studentLevel);
    }

    @Override
    public Student checkStatus(Student student) {
        return super.checkStatus(student);
    }

    @Override
    public Double getAverageGrade() {
        double naughtyStudGrade;
        return naughtyStudGrade = super.getAverageGrade() + (super.getAverageGrade()*0.1);
    }
}
