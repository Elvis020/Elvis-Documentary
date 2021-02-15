package com.elvis.training_labs_personal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Child c = new Child();
        c.parentMethod();
        c.childMethod();
        GrandChild gc = new GrandChild();
        gc.grandChildMethod();
        gc.childMethod();
        gc.parentMethod();
//        Interfaces
        MultipleInterfaces mi = new MultipleInterfaces();
        mi.interfaceMethod1();
        mi.interfaceMethod2();
        HybridClass hc = new HybridClass();
        hc.parentMethod();
        hc.interfaceMethod1();
        hc.interfaceMethod2();

    }
}
