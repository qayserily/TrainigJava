package replit;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        // DO NOT CHANGE:
        System.out.println("Welcome SDET Motors Inc. ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        if (vehicleYear>=1995 && vehicleYear <=1998){
            System.out.println("Your vehicle needs to be recalled!");
        } else if(vehicleYear>=2001 && vehicleYear<=2002){
            System.out.println(" Go to service");
        } else if(vehicleYear>=2003 && vehicleYear<=2006){
            System.out.println("etc");
        } else{
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
