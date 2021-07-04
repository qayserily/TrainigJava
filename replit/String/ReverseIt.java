package String;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int wL = word.length();
        String reverse = "";

        if ( wL == 5) {
            for ( int i = wL-1; i >= 0; i--) {
                reverse += word.charAt(i);
            }
            System.out.println(reverse);
        }
        else {
            if(wL > 5) {
                System.out.println("Too long!");
            }
            else {
                System.out.println("Too short!");
            }
        }


    }
}
