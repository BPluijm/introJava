package com.company;

public interface Vehicle {

    // als je ze in alle classes wilt gebruiken moet de variabele final zijn
    final int gears = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void out() {
        System.out.println("Default method");
    }

    static int math(int b) {
        return b + 9;
    }
}
