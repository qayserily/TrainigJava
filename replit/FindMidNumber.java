package replit;

import java.util.Scanner;

public class FindMidNumber {
    public static int middleOfThree(int a, int b,
                                    int c)
    {
        // Checking for b
        if ((a < b && b < c) || (c < b && b < a))
            return b;

            // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
            return a;

        else
            return c;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println( "Enter a number : ");
        int a = scanner.nextInt();
        System.out.println( "Enter second number : ");
        int b = scanner.nextInt();
        System.out.println( "Enter third number : ");
        int c = scanner.nextInt();
        System.out.println(middleOfThree(a, b, c) );
    }

}
