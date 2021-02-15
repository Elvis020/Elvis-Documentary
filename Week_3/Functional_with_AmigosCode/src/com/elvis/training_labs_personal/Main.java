package com.elvis.training_labs_personal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
          new Person("Ama",Gender.FEMALE),
          new Person("Esi",Gender.FEMALE),
          new Person("Abena",Gender.FEMALE),
          new Person("Kojo",Gender.MALE),
          new Person("Akua",Gender.FEMALE),
          new Person("Kwaku",Gender.MALE)
        );


//        List<Person> females = new ArrayList<>();
//        List<Person> males = new ArrayList<>();
////        Imperative Approach
//        for(Person person : people){
//            if(Gender.FEMALE.equals(person.gender)){
//                females.add(person);
//            }
//        }
//
//        for(Person female : females){
//            System.out.println(female);
//        }


//        Declarative Approach
        people.stream()
                .filter(person -> Gender.MALE.equals(person.gender))
                .forEach(System.out::println);

    }


    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }


    enum Gender{
        MALE,FEMALE
    }
}
