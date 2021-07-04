package replit;
import java.util.*;

public class VideoGameCoupons {
    public static void main(String[] args) {
        //Write your code here
        int candyBar = 10;
        int gumBall = 3;
        int numCandyBars = 0;
        int numOfGumBalls = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of coupons: ");
        int coupons = keyboard.nextInt();

        if(coupons<10){
            System.out.println("Not enough coupons");
        } else if(coupons<=10 && coupons<13){
            numCandyBars = coupons/candyBar;
            System.out.println("Number of Candies: " + numCandyBars);
        } else{
            numCandyBars = coupons/candyBar;
            numOfGumBalls = (coupons%candyBar) / gumBall;

            System.out.println("Number of Candies: " + numCandyBars);
            System.out.println("Number of Gumballs: " + numOfGumBalls);
        }

    }
}