package com.polymorphism;

public class Surgeon implements Doctor {

    public void doMedicine() {
        System.out.println("Gives medicine only after the surgery!");
    }

    public void performSurgery() {
        System.out.println("performs the surgery, only if the patient is serious with the health condition!");
    }
}
