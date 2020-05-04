package com.pluralsight.test;

public class Main {

    public static void main(String[] args) {
        String name, surname, address;
        int age, yearOfBirth = 1921, currentYear = 2020;
//        yearOfBirth = 2003;
//        currentYear = 2020;
        age = currentYear - yearOfBirth;
        float height = 169.57f;

        name = "Foday";
        surname = "Sanyang";
        address = "37 Garba Jahumpa Rd.";

        System.out.println("Hi! My name is " + name + surname);

        System.out.println("Check out my Bio Info");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Surname: %s%n", surname);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        if(age >= 18 && age <= 50) {
            if(age > 0) {
                System.out.println("You're an adult");
            }
        }
        else if(age < 18) {
            System.out.println("You're a teenager.");
        }
        else {
            System.out.println("You're an old person.");
        }

	// write your code here
    }
}
