package replit;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int num = s.nextInt();

        //your code here
        if (num<0){
            System.out.println(num + " is negative number");
        } else if(num>0){
            System.out.println(num + " is pozitive number");
        } else{
            System.out.println(num + " is zero");
        }
    }
}
