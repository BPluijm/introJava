package com.company;
import java.util.*;


public class SetsAndLists {

    public static void main(String[] args) {
//
//        // HashSet = een verzameling van ongeordene elementen die uniek zijn
//        Set<Integer> t = new HashSet<Integer>();
//        // toevoegen
//        t.add(5);
//        t.add(7);
//        t.add(5);
//        t.add(9);
//        t.add(-8);
//
//        // verwijderen
//        t.remove(9);
//
//        // helemaal wissen
////        t.clear();
//
//        // vertelt je of de set leeg is
////        t.isEmpty();
//
//        // lengte van de set
//        int z = t.size();
//
//        // controleren of het erin zit
//        boolean x = t.contains(5);
//
//
//        System.out.println(t);

//        // TreeSet = geeft de set in volgorde weer
//        Set<Integer> t = new TreeSet<Integer>();
//
//        t.add(5);
//        t.add(7);
//        t.add(5);
//        t.add(9);
//        t.add(-8);
//
//        int x = t.size();
//
//        System.out.println(t);

        // LinkedHashSet = is zelfde als HashSet maar dan sneller
//        Set<Integer> t = new LinkedHashSet<Integer>();
//
//        t.add(5);
//        t.add(7);
//        t.add(5);
//        t.add(9);
//        t.add(-8);
//        t.remove(9);
//
//        int x = t.size();
//
//        System.out.println(t);



        // LISTS


//        ArrayList<Integer> t = new ArrayList<Integer>();
//        t.add(1);
//        t.add(2);
//        t.add(1);
//        t.add(2);
//        t.add(1);
//        t.add(2);
//        // welke index uit de ArrayList je wilt weergeven
////        t.get(0);
//        // iets wijzigen wat op die index al bestaat
//        t.set(1, 5);
////        t.size();
//        // hiermee kun je bepaalde indexen weergeven
//        // het is tot en niet tot en met, hieronder worden dus index 1 en 2 aangeroepen
//        t.subList(1, 3);


//        System.out.println(t.subList(1, 3));


        // LinkedList = deze werkt sneller dan een ArrayList

        LinkedList<Integer> t = new LinkedList<Integer>();
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        t.add(1);
        t.add(2);
        // welke index uit de ArrayList je wilt weergeven
//        t.get(0);
        // iets wijzigen wat op die index al bestaat
        t.set(1, 5);
//        t.size();
        // hiermee kun je bepaalde indexen weergeven
        // het is tot en niet tot en met, hieronder worden dus index 1 en 2 aangeroepen
        t.subList(1, 3);


        System.out.println(t.subList(1, 3));



    }
}
