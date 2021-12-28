package com.company;

public class Dog {

    // door private kun je de variabele alleen hier aanspreken
    // protected = alleen in dezelfde package is dit aan te roepen
    protected String name;
    public int age;

    // constructor method
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //methode
    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    // als je private gebruikt dan kun je hem in deze class aanroepen zonder this ervoor.
//    private int add2() {
//        return this.age + 2;
//    }

}
