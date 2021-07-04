package replit;

import java.util.Scanner;

public class overDose {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");
        int milligrams = scn.nextInt();

        int overdoseCaffeineGrams = 10;
        int overdoseCaffeineMilligrams = overdoseCaffeineGrams * 1000;
        int caffeineLethalDose = overdoseCaffeineMilligrams / milligrams;

        System.out.println("It would take about " + caffeineLethalDose + " drinks for a lethal overdose.");
    }
}