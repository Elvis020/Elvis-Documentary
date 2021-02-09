package com.elvis.training_labs_personal;

public class Main {
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    enum Season {
        SPRING,AUTUMN,WINTER,SUMMER
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Main Here");
//        Day d = Day.MONDAY;
//        System.out.println("Today is: " + d);
        for(Day n : Day.values()){
            System.out.println(n);
        }
        for (Season s : Season.values()){
            System.out.print(s + " ");
        }
        System.out.println();
        seasonMethod(Season.AUTUMN);
    }
    static void seasonMethod(Season m){
        switch (m){
            case SPRING:
                System.out.println("Welcome to the Spring.!!");
                break;
            case SUMMER:
                System.out.println("Welcome to the Summer, Knig Kong!!");
                break;
            case AUTUMN:
                System.out.println("Welcome to the Autumn, Mermaid!!");
                break;
            case WINTER:
                System.out.println("Welcome to the Winter, Soldier!!");
                break;
            default:
                System.out.println("Season not available.!");
        }
    }
}
