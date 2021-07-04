package codingbatcom.warmup1;

import java.util.Scanner;

public class makes10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println(makes10(num1,num2));
    }
    public static boolean makes10(int a, int b) {
        if (a ==10){
            return true;
        } else if(b==10){
            return true;
        } else if (a+b==10){
            return true;
        } else {
            return false;
        }

    }


}
/*
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */