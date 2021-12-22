package com.company;

import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Type a number: ");
//        int x = sc.nextInt();

        int x;
//
       // als je geen do while loop gebruikt moet je de code dubbel invoeren
//        int count = 0;
//        while (x != 10) {
//            System.out.println("Typ 10...");
//            System.out.println("Typ a number: ");
//            x = sc.nextInt();
//            count++;
//        }
//
//        System.out.println("You tried " + count + " times");

        do {
            System.out.println("Type a number: ");
            x = sc.nextInt();
        }  while (x != 10);
    }
}
