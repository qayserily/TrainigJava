package Loops;

import java.util.Scanner;

public class LoopsPrint_n_times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***********    :");
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE

       for (int i =0;i<n; i++){
           System.out.println("*");
       }
       scan.close();
    }
}
/*
Given an int variable **n** print out **n** asterisks. So if n=5, five asterisks will be printed.
 */