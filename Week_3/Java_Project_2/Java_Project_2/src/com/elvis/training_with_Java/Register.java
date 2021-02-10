package com.elvis.training_with_Java;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    List<? extends Student> nameables;
    public Register(List<? extends Student> nameables) {
        this.nameables = nameables;
    }



    List<String> getRegister(){
//        List<String> listOfStudentNames = new ArrayList<>();
        return nameables.stream()
                .map(n->n.getName())
                .collect(Collectors.toList());


//                Before refactoring
//        for(Nameable n: nameables){
//            listOfStudentNames.add(n.getName());
//        }
//        return listOfStudentNames;
    }

//    List<String> getRegisterByLevel(Level level){
//        List<String> studentsInAParticularLevel = new ArrayList<>();
//        for(Student s : nameables){
//            if(s.getLevel().equals(level)){
//                studentsInAParticularLevel.add(s.getName());
//            }
//        }
//        return studentsInAParticularLevel;
//    }
    Map<Level, List<Student>> getRegisterByLevel(Level level){
//        Before refactoring
        Map<Level,List<Student>> studentsInAParticularLevel = new HashMap();
        List<Student> stuList  = new ArrayList<>();
        for(Student s : nameables){
            if(s.getLevel().equals(level)){
                stuList.add(s);
                studentsInAParticularLevel.put(level,stuList);
            }
        }
        return studentsInAParticularLevel;


//        After refactoring
//        studentsInAParticularLevel.put(level,stuList)
//                .stream()
//                .map(p ->stuList.add(p))
//        List<Student> stuListBig = stuList.stream()
//                .filter(c->c.getLevel().equals(level))
//                .map(p ->)
//                .collect(Collectors.toList());
//        add
//
//        studentsInAParticularLevel.put(level,stuListBig)
//                .stream()
//                .filter(s -> s.getLevel().equals(level))
//                .collect(Collectors.toList());
//        return studentsInAParticularLevel;

    }


    void printReport(){
//        Before refactoring
//        Collections.sort(nameables,new OrderByName());
//
//        for(Student s : nameables){
//            System.out.println(
//
//            );
//        }



//        After refactoring
        nameables.stream()
                .sorted(Comparator.comparing(Student::getLevel))
                .forEach(s-> System.out.println(s.getName() + " -------> " + s.getLevel()));
    }


    public void sort(Comparator<Student> studentsSorted){
//        After Refactoring(Paused)
        nameables.stream()
                .sorted(studentsSorted)
                .collect(Collectors.toList());

//        Before refatoring
//        nameables.sort(studentsSorted);
    }


    public Student getStudentByName(String name) throws StudentNotFoundException {
        Student selectedStudent = new Student(name);
        List<String> studentList = new ArrayList<>();
        for (Student student : nameables) {
            studentList.add(student.getName());
            }
        if(studentList.contains(name)){
            System.out.println(name + "is a student");
        }
        else{
            throw new StudentNotFoundException("Sorry, No student by that name");
        }

//        System.out.println(sa);
        return selectedStudent;
    }



    public double getHighestGrade(){
        return nameables.stream().flatMapToDouble(g->g.gradesOfStudent()).max().getAsDouble();
    }

    public double averageOfAllStudentsGrades(){
        return nameables.stream().flatMapToDouble(g->g.gradesOfStudent()).average().getAsDouble();
    }
    
    
//    public findGradesOfAllAbove

}
