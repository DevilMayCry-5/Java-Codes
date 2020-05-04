package com.pluralsight.test.calc;

public class Main {

    public static void main(String[] args) {
        float[] yearOfBirth = {1976, 1996, 2001, 2003, 2005, 2008, 2010};
        int currentYear = 2020;
        String[] names = {"Saily Njie", "Foday Sanyang", "Sireh Sanyang", "Muhammed Jeng", "Sheikh Jeng", "Fatou Secka", "Marget Jeng"};
        String name = "";
        char[] nameCodes = {'Z', 'F', 'S', 'M', 's', 'f', 'm'};
        float[] age = new float[nameCodes.length];

        for(currentYear = 2020; currentYear <= 2025; currentYear++) {
            System.out.println("Year " + currentYear);
            for (int i = 0; i < nameCodes.length; i++) {
                switch (nameCodes[i]) {
                    case 'S':
                    case 'M':
                    case 'F':
                    case 's':
                    case 'm':
                    case 'f':
                    case 'Z':
                        age[i] = currentYear - yearOfBirth[i];
                        name = names[i];
                        break;
                    default:
                        System.out.println("Invalid name code");
                        age[i] = 0.0f;
                }
                System.out.printf("%s: %s years \n", name, age[i]);
            }
            System.out.println("");
        }

        class Family {
            String name;
            String lastName;
            int age;
        }


        //testing some class
        Family mother = new Family();
                mother.name = "Saily";
                mother.lastName = "Njie";
                mother.age = 44;

        Family son = new Family();
                son.name = "Foday";
    }
}
