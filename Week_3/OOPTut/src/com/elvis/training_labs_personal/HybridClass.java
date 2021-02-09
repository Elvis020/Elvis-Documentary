package com.elvis.training_labs_personal;

public class HybridClass extends Parent implements Interface3 {
    @Override
    protected void parentMethod() {
        super.parentMethod();
        System.out.println("Hybrid just overrided the parent method");
    }

    @Override
    public void interfaceMethod1() {
        System.out.println("Hybrid is calling interface method1...");

    }

    @Override
    public void interfaceMethod2() {
        System.out.println("Hybrid is calling interface method2...");

    }
}
