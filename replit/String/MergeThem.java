package String;

import java.util.Scanner;

public class MergeThem {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word1 = scan.next();
            String word2 = scan.next();
            //YOUR CODE HERE

            int wL1 = word1.length();
            int wL2 = word2.length();

            if (wL1 == 3 && wL2 == 3) {
                System.out.println("" + word1.charAt(0) + word2.charAt(0)
                        + word1.charAt(1) + word2.charAt(1)
                        + word1.charAt(2) + word2.charAt(2));
            } else {
                System.out.println("cannot merge");
            }


        }
    }

/*
You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:
 */