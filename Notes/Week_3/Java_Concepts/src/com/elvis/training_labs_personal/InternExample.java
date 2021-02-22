package com.elvis.training_labs_personal;

public class InternExample {
    public static void main(String[] args) {
        String const1 = "Elvis";



        String s = new String("Elvis");
        System.out.println("Using the ==: " + (const1 == s)); //false
        System.out.println("Using the .equals method: " +const1.equals(s)); //true


//        Pushing it into the String pool using the intern method.
        System.out.println();
        System.out.println("After pushing it into the string pool using the intern method.");
        s = s.intern();
        System.out.println("Using the ==: " + (const1 == s)); //false
        System.out.println("Using the .equals method: " +const1.equals(s)); //true

    }
}
