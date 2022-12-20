package nl.novi.tripledigits;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variabele toevoegen

       int firstDigit;
       int secondDigit;
       int thirdDigit;

       int maximum = 9;

        Random randomizer = new Random();

        firstDigit = randomizer.nextInt(maximum) + 1;
        secondDigit = randomizer.nextInt(maximum) + 1;
        thirdDigit = randomizer.nextInt(maximum) + 1;


        System.out.println("De waarde van het eerste getal is: " + firstDigit);
        System.out.println("De waarde van het tweede getal is: " + secondDigit);
        System.out.println("De waarde van het derde getal is: " + thirdDigit);

int sumOfDigits = firstDigit + secondDigit + thirdDigit;
int productOfDigits = firstDigit * secondDigit * thirdDigit;

//Som is getallen opgeteld
// Product is getallen vermenigvuldigd

        System.out.println("Som: " + sumOfDigits);
        System.out.println("Product:" + productOfDigits);

        Scanner input = new Scanner(System.in);

        int guessA = input.nextInt();
    }
}
