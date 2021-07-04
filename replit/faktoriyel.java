package replit;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        long fakt = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        long sayi = scanner.nextInt();

        for (int i = 1 ; i<=sayi; i++){
            fakt =fakt *i ;
        }
        System.out.println("Faktöriyel : " + fakt);
    }
}
