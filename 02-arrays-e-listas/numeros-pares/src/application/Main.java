package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int numbersToBeRead = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[numbersToBeRead];
        for(int i=0; i < numbersToBeRead; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nEven Numbers:");

        int quantityOfEvenNumbers = 0;
        for(int i=0; i < vect.length; i++) {
            if(vect[i] % 2 == 0) {
                quantityOfEvenNumbers += 1;
                System.out.print(vect[i] + " ");
            }
        }

        System.out.print("\n\nQuantity Of Even Numbers: " + quantityOfEvenNumbers);

        sc.close();
    }
}
