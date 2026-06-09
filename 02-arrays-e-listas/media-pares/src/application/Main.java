package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values will the vector have? ");
        int values = sc.nextInt();

        int[] vect = new int[values];
        for(int i=0; i < values; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        int evenSum = 0;
        int quantityOfEvenNumbers = 0;
        for(int i=0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                evenSum += vect[i];
                quantityOfEvenNumbers++;
            }
        }

        if(quantityOfEvenNumbers == 0){
            System.out.print("No even numbers");
        }
        else{
            System.out.printf("Even Numbers = %.1f", (double) (evenSum / quantityOfEvenNumbers));
        }

        sc.close();
    }
}
