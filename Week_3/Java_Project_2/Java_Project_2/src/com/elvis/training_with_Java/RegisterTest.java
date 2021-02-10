package com.elvis.training_with_Java;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    List<Double> grades1 = Arrays.asList(20.0,30.5,21.5,99.9990,22.7);
    List<Double> grades2 = Arrays.asList(10.0,92.9,20.43,2.5,9.0);
    List<Double> grades3 = Arrays.asList(100.0,12.9,31.3,29.5,39.0);

    Student Kwaku = new Student("Kwaku",grades1,Level.LEVEL100);
    Student Abena = new Student("Abena",grades2,Level.LEVEL200);
    Student Marfo = new Student("Marfo",grades3,Level.LEVEL100);
    Student Akua = new Student("Akua",grades3,Level.LEVEL300);
    Student Mansa= new Student("Mansa",grades3,Level.LEVEL400);
    Student Pokuaa = new Student("Pokuaa",grades3,Level.LEVEL100);
    NaughtyStudent Sottie = new NaughtyStudent("Sottie",grades3,Level.LEVEL100);
    List<String> namesList = Arrays.asList("Abena","Marfo","Kwaku","Sottie");


    @Test
    void getRegister() {
        List<Nameable> names = new ArrayList<>();
        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku,Sottie);
        Register r1 = new Register(students);
        assertEquals(namesList,r1.getRegister());
    }

    @Test
    void getRegisterByLevel() {
        Map<Level,List<Student>> namesOfStudentsActualLevel = new HashMap<>();
        List<Student> studentsInLevel100 = Arrays.asList(Marfo,Kwaku);
        namesOfStudentsActualLevel.put(Level.LEVEL100,studentsInLevel100);

        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku);
        Register r1 = new Register(students);
        Map<Level,List<Student>> namesOfStudentsRequiredLevel = r1.getRegisterByLevel(Level.LEVEL100);
        for(Map.Entry<Level,List<Student>> m : namesOfStudentsRequiredLevel.entrySet()){
//            Trying to loop through for the values
            System.out.println(m.getValue());
        }
        assertEquals(namesOfStudentsActualLevel,namesOfStudentsRequiredLevel);
    }

    @Test
    void printReport() {
        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku,Akua,Mansa,Pokuaa);
        Register r1 = new Register(students);
        r1.printReport();
    }

    @Test
    void sort() {
        List<String> requiredStudents = Arrays.asList(Abena.getName(), Akua.getName(), Kwaku.getName(), Mansa.getName(), Marfo.getName(), Pokuaa.getName());
        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku,Akua,Mansa,Pokuaa);
        Register r1 = new Register(students);
        SortByName sbn = new SortByName();
        r1.sort(sbn);
        List<String> actualStudents = r1.getRegister();
        System.out.println(actualStudents);
        assertEquals(requiredStudents,actualStudents);

    }

    @Test
    void getStudentByName() throws StudentNotFoundException {
        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku,Akua,Mansa,Pokuaa);
        Register r1 = new Register(students);
        Student searchByName = r1.getStudentByName("Marfo");

//        System.out.println(nameOfStudent);
    }

    @Test
    void getHighestGrade() {
        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku,Akua,Mansa,Pokuaa);
        Register r1 = new Register(students);
        System.out.println(r1.getHighestGrade());
        assertEquals(100.0,r1.getHighestGrade());
    }

    @Test
    void averageOfAllStudentsGrades() {
        List<Student> students = Arrays.asList(Abena,Marfo,Kwaku,Akua,Mansa,Pokuaa);
        Register r1 = new Register(students);
        System.out.println(r1.averageOfAllStudentsGrades());
//        assertEquals(100.0,r1.averageOfAllStudentsGrades());
    }
}