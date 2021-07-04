package Loops;

import java.util.Scanner;

public class LoopsPrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("**************** :");
        String word = inp.nextLine();
        //write your code below

        int length = word.length();

        for (int a = 0; a < length; a++) {
            char letter = word.charAt(a);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {

                System.out.print(letter);

            }
        }
    }
}