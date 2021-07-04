package Loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;

        int i = 0;
        while (i < str.length() - 1) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}

