package replit.Arrays;

import java.util.Scanner;

public class ArraysPrinting01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!


        for(int j =0; j<5; j++) {
            System.out.println(arr[j].substring(0, 3));

        }
    }

}
/*
The code provided in your main method will take in five Strings and save them into an array called **arr**.
Print out the first three letter of each element on separate lines.
You can assume that every element of arr is at least 3 letters long.
 */