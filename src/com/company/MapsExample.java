package com.company;

import java.util.*;

public class MapsExample {

    public static void main(String[] args) {

        // hiermee kun je nagaan hoe vaak je letter etc. voorkomen in de string

        Map m = new HashMap();
        String str = "hello my name is tim an i am cool";
        // het lijkt alsof het gewoon wordt geprint, maar je zit eigenlijk in de array
//        System.out.println(str.toCharArray());

        for (char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old+1);
            } else {
                m.put(x, 1);
            }
        }

        System.out.println(m);



        // om een array te printen dien je en for loop te gebruiken
        int[] x = {-99,5,6,3,2,1,7,8,0};

        // de array wordt nu gesorteerd van index 1 t/m index 7
        Arrays.sort(x, 1, 7);

        for(int i:x) {
            System.out.print(i + ",");
        }




    }


}
