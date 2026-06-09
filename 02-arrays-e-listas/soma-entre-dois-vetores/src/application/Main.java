package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int quantityOfElements = sc.nextInt();

        int[] vectorA = new int[quantityOfElements];
        int[] vectorB = new int[quantityOfElements];

        System.out.println("Enter the values of vector A:");

        for(int i=0; i < quantityOfElements; i++) {
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Enter the values of vector B:");
        for(int i=0; i < quantityOfElements; i++) {
            vectorB[i] = sc.nextInt();
        }

        System.out.println("Final vector:");

        int[] vectorC = new int[quantityOfElements];
        for(int i=0; i < quantityOfElements; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }

        sc.close();
    }
}
