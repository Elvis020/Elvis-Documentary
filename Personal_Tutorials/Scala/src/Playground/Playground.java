package Playground;

public class Playground {
    public static void main(String[] args) {
//        Person p = new Person();
        System.out.println("Hello from Java");


        System.out.println("Using Class Level Functionality");
        System.out.println(Person.N_EYES);
    }
}

class Person {
    public static final int N_EYES= 2;
}
