package String;

import java.util.Scanner;

public class FindTheLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text  :");
        String text = scanner.next();
        System.out.println(text.length());
    }
}
// Write a program that will output length of the text (string).