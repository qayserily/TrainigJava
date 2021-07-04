package String;

import java.util.Scanner;

public class printLastCharacter {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();
        //WRITE YOUR CODE HERE:
        System.out.println(word.charAt(word.length()-1));
    }
}

//Write a program that will print out last letter of the word (string).
