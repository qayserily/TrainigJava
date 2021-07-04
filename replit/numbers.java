package replit;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //CODE HERE:
        if (num1 == num2) {
            System.out.println("Number 1 is equal to number 2");
        } else if(num1 < num2){
            System.out.println("Number 1 is smaller than number 2");
        } else{
            System.out.println("Number 2 is smaller than number 1");
        }
    }
}
