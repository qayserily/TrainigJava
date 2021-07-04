package codingbatcom.warmup1;

import java.util.Scanner;

public class sumDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println(sumDouble(num1,num2));
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum * 2;
        } else {
            return sum;
        }
    }
}
/*

Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */