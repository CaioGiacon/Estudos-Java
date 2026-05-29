package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numbersToBeRead;
        double sum = 0.0;
        double average;

        System.out.print("How many numbers are you going to type? ");
        numbersToBeRead = sc.nextInt();

        double[] vect = new double[numbersToBeRead];
        for(int i=0; i < numbersToBeRead; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
        }

        for(int i=0; i < vect.length; i++) {
            sum += vect[i];
        }

        average = sum / vect.length;

        System.out.println();
        System.out.print("VALUES = ");

        for(int i=0; i < vect.length; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.println("\nSUM = " + sum);
        System.out.println("Mean = " + average);
        sc.close();
    }
}
