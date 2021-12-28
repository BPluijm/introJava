package com.company;
import java.util.*;

public class MapsAndHashMaps {

    public static void main(String[] args) {

        // deze map heeft geen volgorde bij het weergeven
        Map m = new HashMap();
        // toevoegen aan de map
        // tim heeft waarde 5
        // je kant variabele mixen
        m.put("tim", 5);
        m.put("joe", "x");
        m.put(11, 999);
        m.put("bill", "SHOE");

        System.out.println(m);



        //  TreeMap

        // hier kun je niet een int en een string toevoegen
        // de waarde van de key mag wel alle variabele bevatten
        // komt in alfabetische volgorde

        Map a = new TreeMap();
        a.put("tim", 5);
        a.put("joe", "x");
        a.put("a", "b");

        System.out.println(a);


        // LinkedHashMap

        // geeft de volgorde van invoer weer

        Map b = new LinkedHashMap();
        b.put("tim", 5);
        b.put("joe", "x");
        b.put("a", "b");

        // controleren of de waarde erin zit
        b.containsValue("b");
        b.containsKey(5);

        // een input verwijderen
        b.remove("tim");

        // alles verwijderen
//        b.clear();

        // alle values printen
        System.out.println(b.values());

        // de key 5 bestaat niet wel de value 5
        System.out.println(b.get(5));


    }
}
