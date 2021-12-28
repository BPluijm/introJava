package com.company;

public class OuterClass {
    public class InnerClasses {
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner() {
        InnerClasses in = new InnerClasses();
        in.display();
    }

}
