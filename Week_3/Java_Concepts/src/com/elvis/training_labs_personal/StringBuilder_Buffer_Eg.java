package com.elvis.training_labs_personal;

public class StringBuilder_Buffer_Eg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Wall Street ");
        sb = sb.append(12).append(",").append("New York");
        System.out.println(sb);

//        Inserting something into sb
        System.out.println(sb.insert(15, " 5th, floor "));
//        Deleting a character in a substring seq.
        System.out.println(sb.delete(15,26));
//        Reversing a given string
//        System.out.println(sb.reverse());
//        Transforming the variable into a string object is done thru the toString method
        String s = sb.toString();
        System.out.println(s);
    }
}
