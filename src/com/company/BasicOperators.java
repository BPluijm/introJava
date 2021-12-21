package com.company;

public class BasicOperators {

    public static void main(String[] args) {
//        int a;
//        a = 120;

        int x = 5;
        int y = 7;
        int z = 57;
        double u = z / y;

        // int wordt veranderd in een double en print daarom niet de juiste waarde uit
        // als 1 van de int een double was had het wel gewerkt
//        System.out.println(u);

        // kwadraat
        double d = Math.pow(x, y);

        System.out.println(d);
    }
}
