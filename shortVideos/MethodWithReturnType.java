package shortVideos;

import java.util.Scanner;

public class MethodWithReturnType {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");

        int num = scan.nextInt();
        System.out.println("You entered " + num); */
        int result = doubleTheNumber(100);
        System.out.println(result);
    }
    //create a method that accept one number and return the doubled value
    //10 -->20
    public static int doubleTheNumber(int num){
       /* int result = num * 2 ;
        return result; */
        return num*2;
    }
}
