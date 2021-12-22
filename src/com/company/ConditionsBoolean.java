package com.company;

public class ConditionsBoolean {

    public static void main(String[] args) {

        int x = 6;
        int y = 23;
        int z = 10;

        // > < == >= <= !=

        boolean compare = !(x < y && z == x);

        System.out.println(compare);

    }
}
