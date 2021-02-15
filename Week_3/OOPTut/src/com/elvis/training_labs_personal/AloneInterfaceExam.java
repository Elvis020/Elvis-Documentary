package com.elvis.training_labs_personal;





public class AloneInterfaceExam implements ForStandAlone {
    public static void main(String[] args) {
        System.out.println("Welcome... to the interface example.");
        System.out.println(color);
        AloneInterfaceExam fsa = new AloneInterfaceExam();
        fsa.DrinkUp();

    }

    @Override
    public void DrinkUp() {
        System.out.println("I am drinking from the bottle");
    }
}
