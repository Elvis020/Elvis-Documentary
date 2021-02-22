package com.elvis.training_labs_personal;

abstract class Person{
    abstract void reactToSnow();
}

class Student extends Person{
    @Override
    void reactToSnow() {
        System.out.println("wahayyy! snow day!");
    }
}
class Lecturer extends Person{
    @Override
    void reactToSnow() {
        System.out.println("oh no! my Curriculum!");
    }
}
class Parent extends Person{
    @Override
    void reactToSnow() {
        System.out.println("yay! its a quiet day");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("What do we do when it snows");
        Person p = new Parent();
        p.reactToSnow();
    }
}
