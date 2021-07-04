package String;

import java.util.Scanner;

public class printFirstCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        System.out.println(word.charAt(0));
    }
}
// Write a program that will print out the first character of the word.