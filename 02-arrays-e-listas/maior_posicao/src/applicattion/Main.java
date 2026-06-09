package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int numbersToBeRead = sc.nextInt();

        double[] realNumbersVect = new double[numbersToBeRead];
        for(int i=0; i < numbersToBeRead; i++) {
            System.out.print("Type a number: ");
            realNumbersVect[i] = sc.nextDouble();

        }

        double greatestNumber = 0.0;
        int greatestNumberPosition = 0;
        for(int i=0; i < realNumbersVect.length; i++) {
            if(realNumbersVect[i] > greatestNumber) {
                greatestNumber = realNumbersVect[i];
                greatestNumberPosition = i;
            }
        }

        System.out.print("\nGreatest Number: " + greatestNumber);
        System.out.print("\nPosition of the greatest number = " + greatestNumberPosition);

        sc.close();
    }
}
