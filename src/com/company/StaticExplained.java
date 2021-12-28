package com.company;

public class StaticExplained {

    public static void main(String[] args) {
        Dog tim = new Dog("Tim", 9);
        Dog bill = new Dog("Bill", 10);
        Dog.count = 7;
        System.out.println(Dog.count);

    }


    // normaal is dit een aparte class
    // nu static moeten maken
    public static class Dog {

        // class/static variables
        // static = laat ons statisch toe om count aan te passen
        protected static int count = 0;

        // attributes
        protected String name;
        protected int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
            // je moet Dog (naam van de class) gebruiken omdat het een static variabele is
            Dog.count += 1;
            Dog.display();
            // hier moet je weer this voor zetten omdat hij niet static is
            this.display2();
        }

        public void display2() {
            System.out.println("I am a dog");
        }

        public static void display() {
            System.out.println("I am a dog");
        }
    }

}




