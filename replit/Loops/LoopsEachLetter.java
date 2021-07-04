package Loops;

import java.util.Scanner;

public class LoopsEachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        for (int i =0 ; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }

    }
}
/*
Given a String, use a loop to print every character from the String on a new line.
 */
