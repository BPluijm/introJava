package com.company;

public class MainDog {

    public static void main(String[] args) {

        Dog tim = new Dog("Tim", 4);
        tim.speak();
//        Dog bill = new Dog("Bill", 7);
//        bill.speak();
//        Dog bob = new Dog("Bob", 11);
//        bob.speak();

        // Getter
//        int x = tim.getAge();
//        System.out.println(x);

        // Setter
        tim.setAge(10);
        tim.speak();

        // cat aanspreken
       Cat bas = new Cat("Bas", 36, 100);
       Cat joey = new Cat("Joey", 7);
       Cat mike = new Cat("Mike");

        bas.speak();
        joey.speak();
        mike.speak();
    }
}
