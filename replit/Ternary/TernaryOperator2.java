package Ternary;

import java.util.Scanner;

public class TernaryOperator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

        String bigger = (num1>num2)?"num1" : "num2";
        System.out.println(bigger);
    }
}
/* Write an expression using the conditional operator (? :)
that compares the values of the variables num1 and num2.
The result (that is the value) of this expression should be the value of the larger of the two variables.
The larger value should be printed out.
 */
