package com.company;

import java.util.Scanner;

public class IntroObjects {

    // main is ook een methode
    public static void main(String[] args) {
        // scanner is een object
        Scanner sc = new Scanner(System.in);
        // next() is een methode
//        sc.next();
        String h = "hello";
        h.length();

        System.out.println(add2(6));
        System.out.println(str("hello world"));
        
        // hier aanroepen anders werkt de println niet
        tim("Tim!", 4);

    }

    // methode
    // als je tussen () iets invult dien je het hierboven ook te doen
    public static void tim(String str, int x) {
        // door de for loop wordt Tim! even vaak als x geprint
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }


    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String z) {
        return z + "!";
    }


}
