package applicattion;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numbersToBeRead;

        System.out.print("How many numbers are you going to type? ");
        numbersToBeRead = sc.nextInt();
        sc.nextLine();
        int[] vect = new int[numbersToBeRead];

        for(int i=0; i < numbersToBeRead; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NEGATIVES NUMBERS: ");

        for(int i = 0; i < vect.length; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
