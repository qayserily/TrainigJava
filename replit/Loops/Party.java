package Loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name : ");
        String name = input.next();
        // your code
        // ------------------------------------------
        System.out.println("Do you want to enter new guest name :");
        Boolean extra = input.nextBoolean();
        if (extra==true){
            System.out.println("Please enter guest name :");
            String second = input.next();
            if (extra==true){
                System.out.println("Do you want to enter new guest name :");
                String third = input.next();
            } else{
                input.close();
            }
        } else{
            System.out.println("Bye Bye...");
        }

    }
}
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
 If yes - take the next guest input
If not - finish the program and print list of the guests.
 */