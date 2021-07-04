package String;

import java.util.Scanner;

public class verifyContains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = scan.nextLine();
        System.out.println("Enter a word in this sentence : ");
        String word = scan.nextLine();

        if(sentence.contains(word)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
/* Write a program that will verify if the **sentence** contains **word**.
Print out the result as a boolean value. */