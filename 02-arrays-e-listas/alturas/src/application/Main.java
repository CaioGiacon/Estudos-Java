package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be entered into the system? ");
        int numberOfPeople = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[numberOfPeople];

        int minorData = 0;
        double minorPercentage;
        double heightSum = 0.0;
        for(int i=0; i < numberOfPeople; i++) {
            System.out.println((i+1) + " person data:");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            System.out.println();
            sc.nextLine();

            vect[i] = new Person(name, age, height);

            if(vect[i].getAge() < 16) {
                minorData += 1;
            }
            heightSum += vect[i].getHeight();
        }

        minorPercentage = ((double)minorData / numberOfPeople) * 100.0;
        double averageHeight = heightSum / vect.length;
        System.out.printf("AVERAGE HEIGHT = %.2f\n", averageHeight);
        System.out.printf("PEOPLE UNDER 16 YEARS OLD: %.1f%%\n", minorPercentage);

        for(int i=0; i < vect.length; i++) {
            if(vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }
        sc.close();
    }
}
