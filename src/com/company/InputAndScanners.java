package com.company;

import java.util.Scanner;

public class InputAndScanners {

    public static void main(String[] args) {

        // scanner is een datatype
        // hierdoor kun je in de terminal intypen
        // het returned een string
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();

        //
        int x = Integer.parseInt(scanned);

        // hiermee kun je er een int van maken
        int scan = sc.nextInt();

        // hiermee krijg je een boolean
        boolean scan1 = sc.nextBoolean();

        // hiermee krijg je een double
        double scan2 = sc.nextDouble();


        System.out.println(scanned);

    }
}
