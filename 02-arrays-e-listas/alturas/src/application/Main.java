package application;

import entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfPeople;
        double averageHeight;
        double heightSum = 0.0;
        int ages;

        System.out.print("How many people will be entered into the system? ");
        numberOfPeople = sc.nextInt();
        sc.nextLine();

        People[] vect = new People[numberOfPeople];

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

            vect[i] = new People(name, age, height);
        }

        for(int i=0; i < vect.length; i++) {
            heightSum += vect[i].getHeight();
        }

        averageHeight = heightSum / vect.length;
        System.out.printf("AVERAGE HEIGHT = %.2f", averageHeight);

        sc.close();
    }
}
