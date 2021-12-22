package com.company;

public class ForLoops {

    public static void main(String[] args) {

        // i++ = increment
        // <= 10 tot daar loopt de loop
        // uitkomst 5, 6, 7, 8, 9, 10
//
//        for (int i = 5; i <= 10 ; i++) {
//            System.out.println(i);
//        }

        int[] arr = {1,5,7,3,4,5};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 5) {
                System.out.println("Found a 5! at index " + i);
            }
        }

    }
}
