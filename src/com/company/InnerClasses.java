package com.company;

public class InnerClasses {

    public static void main(String[] args) {

        OuterClass out = new OuterClass();
        OuterClass.InnerClasses in = out.new InnerClasses();

        in.display();

        System.out.println();
    }
}
