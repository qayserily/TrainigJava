package replit;

import java.util.Scanner;

public class giftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int price = scan.nextInt();

        int gift_card = 100;
        int balance;
        if(price>gift_card) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if(price<=gift_card){
            balance = gift_card-price ;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Invalid item!");
        }
    }
}
