package replit.Arrays;

import java.util.Scanner;

public class PrintFirstAndLastChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

        // TODO: Write your code below

        for (int j=0; j<5; j++) {
            System.out.println(words[j].substring(0, 1) + words[j].substring(words[j].length()-1));
        }


    }
}
/*
Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
 */