package Loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int catCount = 0;
        int dogCount = 0;
        String word = scan.next();

        for(int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, (i + 3)).equals("cat"))
                catCount += 1;
            if (word.substring(i, (i + 3)).equals("dog"))
                dogCount += 1;
        }

        if (catCount != dogCount) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

}

/*
Print true if the string _"cat"_ and _"dog"_ appear the same number of times in the given string _word_.
 */