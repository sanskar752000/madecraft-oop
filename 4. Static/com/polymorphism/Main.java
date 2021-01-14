package com.polymorphism;

public class Main {

    public static void main(String[] args) {

        GeneralPractitioner gP = new GeneralPractitioner();
        gP.makeHouseCalls();
        gP.doMedicine();

        System.out.println();

        Surgeon surg = new Surgeon();
        surg.performSurgery();
        surg.doMedicine();
    }
}
