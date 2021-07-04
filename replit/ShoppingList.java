package replit;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        Double prize1= scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String item2 = scan.next();
        Double prize2= scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        String item3 = scan.next();
        Double prize3= scan.nextDouble();

        System.out.println(item1+":"+prize1 + " " + item2+":"+prize2+ " " + item3+":"+prize3+ " " );
        System.out.println("Total prize: " +(prize1+prize2+prize3));

    }
}
