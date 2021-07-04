package replit;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        /* Write a program that will determine the change given from the vending machine.
        The program will accept the cents amount and output the change in quarters, dimes, nickels, and pennies.
        1. The given cents value should be more than 0 and less than 100. If the given cents is not in the range
        print "Invalid cents amount" and there should be no other output after
        In valid cases print the change in this format:
        Your change is x quarters, x dimes, x nickels, and x pennies */
        int quarters = 25 ;
        int dimes = 10 ;
        int nickels = 5 ;
        int pennies = 1 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Have much cent have you got ? : ");
        int cent = scan.nextInt();

    }
}
