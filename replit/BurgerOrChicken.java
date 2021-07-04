package replit;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("welcome what would you like? : ");
        String in = s.next();

        double burgerPrice = 10.0;
        double chickenPrice = 10.0;
        double sodaPrice = 2.0;
        double friesPrice = 3.5;
        double sum = 0;
        if (sum == burgerPrice ){
            System.out.println("Price is: " + burgerPrice);
        } else if (sum==chickenPrice){
            System.out.println("Price is: " +chickenPrice);
        } else if (sum == (burgerPrice+sodaPrice)){
            System.out.println("Price is: " + (burgerPrice + sodaPrice));
        } else if (sum == (chickenPrice + sodaPrice)){
            System.out.println("Price is: " + (chickenPrice + sodaPrice));
        } else if (sum ==(burgerPrice+friesPrice)){
            System.out.println("Price is: " + (burgerPrice + friesPrice));
        } else if (sum ==(chickenPrice+ friesPrice)){
            System.out.println("Price is: " + (chickenPrice + friesPrice));
        }
    }
}
/* A fast food company has two main order types, burger meal and chicken meal.
Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.
- If the order is burger price is 10.0
- If the order is chicken price is 10.0
- If the order is soda price is 2.0
- If the order is fries price is 3.5
hint: or operator in java is  || */
