package com.company;

public class MainEnums {

    public static void main(String[] args) {

        Level lvl = Level.LOW;
        // hiermee roep je het nummer van het level aan
        System.out.println(lvl.getLvl());

        System.out.println(Level.valueOf("LOW"));

        // hiermee verander je het level
        lvl.setLvl(5);
        System.out.println(lvl.getLvl());



//        Level[] arr = Level.values();
//
//        for (Level e : arr) {
//            System.out.println(e);
//        }
////        System.out.println(Level.values());
//
//        if(lvl == Level.LOW) {
//            System.out.println(lvl);
//        } else if (lvl == Level.MEDIUM) {
//            System.out.println(lvl);
//        } else {
//            System.out.println(lvl);
//        }



    }
}
