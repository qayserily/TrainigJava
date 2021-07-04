package replit;

import java.util.Scanner;

public class ApartmentLeasingI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("**prices**");
        System.out.println("> (1) 1 bedroom - 1100$\n" +
                "> (2) 2 bedroom - 1850$\n" +
                "> (3) 3 bedroom - 2550$\n" +
                "Please choose your room: ");
        int choosen = scanner.nextInt();
        int oneBedroom = 1100 ;
        int twoBedroom = 1850 ;
        int threeBedroom = 2550 ;

        if (choosen == 1) {
            System.out.println("One Bedroom Selected\n" +
                    "Starting Price: 1100");
        } else if (choosen == 2) {
            System.out.println("Two Bedroom Selected\n" +
                    "Starting Price: 1850");
        } else if (choosen == 3){
            System.out.println("Three Bedroom Selected\n" +
                    "Starting Price: 2550");
        } else{
            System.out.println("No such Bedrooms available");
        }


    }
}
