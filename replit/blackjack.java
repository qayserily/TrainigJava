package replit;

import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your cards total value : ");
        int house = s.nextInt();
        System.out.println("Enter your card score : ");
        int player = s.nextInt();

        //Write your code here:

        if (player>21){
            System.out.println("Player bunkrupted");
        }else if (house>player){
            System.out.println("Player losed");
        } else if (house==player){
            System.out.println("Player drew");
        } else if (player>house){
            System.out.println("Player won");
        } else{
            System.out.println("Invalid enterance");
        }
    }
}
/* In blackjack after the player asks to keep the house 4 things may happen.
1. if the card total is bigger then 21 the player busts.
2. if the house score is bigger then the player, the player loses .
3. if the player score is equal to the house then they are a draw.
4. if the player score is bigger then the house the player wins.
player and house scores are represented by  player and house int variables.
check them using ifs to determine the result. */