package replit.Arrays;

import java.util.Scanner;

public class CountEvens {
    public static boolean isEvenNumbers(int num) {
        if(num%2==0)
            return true;
        return false;
        // if function runs the first line returns true, if not goes to the next
        // that's why you don't need else statement
        // if true it doesn't move to the next line
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: Write your code below

        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(isEvenNumbers(nums[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
Given an array **nums**, count and print the number of even numbers in the array
 */