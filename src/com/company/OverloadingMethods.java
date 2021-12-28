package com.company;

public class OverloadingMethods {

    public static void main(String[] args) {
        Student joe = new Student("Joe");
        Student bill = new Student("Bill");
        Student tim = new Student("Tim");

        // systeem weet niet hoe deze objecten te vergelijken
//        System.out.println(joe == bill);

        // door de variabel boolean toe te voegen kun je ze wel vergelijken
//        System.out.println(joe.equals(bill));

        // dit vergelijkt per letter in het alfabet --> a = 1 etc.
        System.out.println(joe.compareTo(bill) > 0);

        // het enige wat dit print is de geheugenplek @65ab7765 is de locatie
        // als de public String is toegevoegd kun je hem wel printen
        System.out.println(tim);

    }


    // moet een aparte class zijn
    public static class Student implements Comparable<Student> {

        private String name;

        public Student(String name) {
            this.name = name;
        }

        public boolean equals(Student other) {
            if (this.name == other.name) {
                return true;
            } else {
                return false;
            }
        }


        // de override wordt toegevoegd omdat we implements hebben toegevoegd
        @Override
        public int compareTo(Student other) {
            return this.name.compareTo(other.name);
        }

        public String toString() {
            return this.name;
        }

    }
}
