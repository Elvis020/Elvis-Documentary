package com.elvis.training_labs_personal;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello.isEmpty());
        System.out.println(hello.isPresent());

//        Case 1
//        String orElse = hello
//                .map(String::toUpperCase)
//                .orElse("World");
//        Case 2 - for some computations
        String orElse = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    return "World";
                });

        System.out.println(orElse);
	// write your code here
    }
}
