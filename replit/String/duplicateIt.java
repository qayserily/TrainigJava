package String;

import java.util.Scanner;

public class duplicateIt {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a word: ");
         String word1 = scan.next();
         System.out.println("Enter a word: ");
         String word2 = scan.next();
         //YOUR CODE HERE
         System.out.println(word1+word2+word2+word1);
    }
}

/*
You have 2 words
Print the first word, second word, second word, first word
 */
