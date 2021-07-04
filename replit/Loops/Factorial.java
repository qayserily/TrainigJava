package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long multiply = 1L;

        for(int i=n; i>0; i--) {
            multiply *=i;
        }
        System.out.println(multiply);


    }
}

/*
In mathematics a **factorial** of a positive integer _n_,
denoted by _n_!, is the product of all positive integers less than or equal to _n_.
 Calculate factorial and output result to the console.
 */